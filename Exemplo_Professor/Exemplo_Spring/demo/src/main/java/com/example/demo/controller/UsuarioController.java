package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UsuarioDTO;
import com.example.demo.service.Utils.ApiResponse;
import com.example.demo.service.Utils.ErrorResponse;
import com.example.demo.service.Utils.UsuarioService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Tag(name="Usuários", description = "Endpoints para gerenciamento de usuários")
@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioservice;


    @Operation(summary = "Busca um usuário por ID", description = "Retorna os detalhes de um usuário específico")
    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> buscarPorIdEntity(@RequestParam Long id) {
        Optional<UsuarioDTO> usuarioDTO = usuarioservice.buscarporId(id);
        return usuarioDTO.map(ResponseEntity::ok)
                          .orElseGet(() -> ResponseEntity.notFound().build());
    }
    
    @Operation(summary = "Cria um novo usuário", description = "Cadastra um novo usuário no sistema")
    @PostMapping
    public ResponseEntity<ApiResponse<UsuarioDTO>> criarUsuario(@Valid @RequestBody UsuarioDTO usuarioDTO){
        try{
        //Tenta salvar o usuário
        UsuarioDTO savedUsuario = usuarioservice.salvar(usuarioDTO);

        //Retorna sucesso com o UsuarioDTO salvo
        ApiResponse<UsuarioDTO> response = new ApiResponse<>(savedUsuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } catch (IllegalArgumentException e) {
            // Cria um erro com a mensagem especifica
            ErrorResponse errorResponse = new ErrorResponse("Argumento inválido", e.getMessage());
            ApiResponse<UsuarioDTO> response = new ApiResponse<>(errorResponse);
            return ResponseEntity.badRequest().body(response);
        } catch(Exception e) {
            //Cria um erro genérico
            ErrorResponse errorResponse = new ErrorResponse("Erro interno", e.getMessage());
            ApiResponse<UsuarioDTO> response = new ApiResponse<>(errorResponse);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}
