import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
        public static void main(String[] args) {
                // Criando uma lista de vendedores
                List<Vendedor> vendedores = new ArrayList<>();
                vendedores.add(new Vendedor("João", 15000.0));
                vendedores.add(new Vendedor("Maria", 5000.0));
                vendedores.add(new Vendedor("Pedro", 12000.0));
                vendedores.add(new Vendedor("Ana", 8000.0));
                vendedores.add(new Vendedor("Carlos", 20000.0));

                // Filtrando os vendedores que venderam mais de R$ 10.000,00
                List<Vendedor> vendedoresAcimaDe10k = vendedores.stream()
                                .filter(v -> v.getTotalVendas() > 10000)
                                .collect(Collectors.toList());

                // Encontrando o vendedor com maior e menor total de vendas
                Optional<Vendedor> vendedorMaiorVenda = vendedores.stream()
                                .max(Comparator.comparingDouble(Vendedor::getTotalVendas));

                Optional<Vendedor> vendedorMenorVenda = vendedores.stream()
                                .min(Comparator.comparingDouble(Vendedor::getTotalVendas));

                // Exibindo resultados
                System.out.println("Vendedores que venderam mais de R$ 10.000,00:");
                vendedoresAcimaDe10k.forEach(System.out::println);

                // Exibindo o vendedor com maior e menor total de vendas
                System.out.println("\nVendedor com maior total de vendas: " + vendedorMaiorVenda.get());
                System.out.println("Vendedor com menor total de vendas: " + vendedorMenorVenda.get());

                // Criando uma lista contendo apenas os nomes dos vendedores
                List<String> nomesVendedores = vendedores.stream()
                                .map(Vendedor::getNome)
                                .collect(Collectors.toList());

                // Exibindo os nomes dos vendedores
                System.out.println("\nNomes dos vendedores:");
                nomesVendedores.forEach(System.out::println);
        }
}
