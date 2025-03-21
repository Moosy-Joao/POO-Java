import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de pedidos
        List<Pedido> pedidos = Arrays.asList(
                new Pedido(1, "Cliente1", 150.0),
                new Pedido(2, "Cliente2", 250.0),
                new Pedido(3, "Cliente3", 350.0),
                new Pedido(4, "Cliente4", 450.0));

        // Mapeando a lista de pedidos para uma lista de PedidoDTO
        List<PedidoDTO> pedidosDTO = pedidos.stream()
                .map(p -> new PedidoDTO(p.getId(), p.getValorTotal()))
                .collect(Collectors.toList());

        // Exibindo os PedidoDTO
        System.out.println("Lista de PedidoDTO:");
        pedidosDTO.forEach(System.out::println);
    }
}
