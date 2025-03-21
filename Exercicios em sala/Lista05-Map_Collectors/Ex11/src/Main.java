import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de pedidos
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(1, "João", "Pago"));
        pedidos.add(new Pedido(2, "Maria", "Pendente"));
        pedidos.add(new Pedido(3, "Pedro", "Cancelado"));
        pedidos.add(new Pedido(4, "Ana", "Pago"));
        pedidos.add(new Pedido(5, "Carlos", "Pendente"));

        // Filtrando os pedidos com status "Pago"
        List<Pedido> pedidosPagos = pedidos.stream()
                .filter(p -> p.getStatus().equals("Pago"))
                .collect(Collectors.toList());

        // Agrupando os pedidos por status
        Map<String, List<Pedido>> pedidosPorStatus = pedidos.stream()
                .collect(Collectors.groupingBy(Pedido::getStatus));

        // Exibindo os pedidos com status "Pago"
        System.out.println("Pedidos com status 'Pago':");
        pedidosPagos.forEach(System.out::println);

        // Exibindo os pedidos agrupados por status
        System.out.println("\nPedidos agrupados por status:");
        pedidosPorStatus.forEach((status, listaPedidos) -> {
            System.out.println("Status: " + status);
            listaPedidos.forEach(System.out::println);
        });
    }
}
