package com.example.demo.Entities;

import java.time.LocalDate;

import org.hibernate.annotations.DialectOverride.GeneratedColumns;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true, name = "usu_cpf")
    private String cpf;

    @Column(nullable = false, unique = true, name = "usu_email")
    private String email;

    @Column(nullable = false, name = "usu_senha")
    private String senha;

    @Column(nullable = false, name = "usu_fone")
    private String telefone;

    @Column(nullable = false, name = "usu_datanasc")
    private String DataNascimento;

    @Column(nullable = false)
    private LocalDate data;

}
