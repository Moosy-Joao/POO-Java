import java.util.*;
import java.util.stream.*;

public class Main {
        public static void main(String[] args) {
                // Criando o ArrayList de produtos
                ArrayList<Produto> produtos = new ArrayList<>();
                produtos.add(new Produto(1, "Produto 1", 150.0));
                produtos.add(new Produto(2, "Produto 2", 50.0));
                produtos.add(new Produto(3, "Produto 3", 200.0));
                produtos.add(new Produto(4, "Produto 4", 30.0));

                // Encontrando o produto mais caro e mais barato
                Optional<Produto> produtoMaisCaro = produtos.stream()
                                .max(Comparator.comparingDouble(Produto::getPreco));

                Optional<Produto> produtoMaisBarato = produtos.stream()
                                .min(Comparator.comparingDouble(Produto::getPreco));

                // Criando uma lista intermediária contendo apenas os nomes dos produtos
                List<String> nomesProdutos = produtos.stream()
                                .map(Produto::getNome)
                                .collect(Collectors.toList());

                // Exibindo os resultados
                produtoMaisCaro.ifPresent(
                                p -> System.out.println("Produto mais caro: " + p.getNome() + " - R$ " + p.getPreco()));
                produtoMaisBarato.ifPresent(p -> System.out
                                .println("Produto mais barato: " + p.getNome() + " - R$ " + p.getPreco()));

                System.out.println("\nLista de nomes dos produtos:");
                nomesProdutos.forEach(System.out::println);
        }
}
