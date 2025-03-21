import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
        public static void main(String[] args) {
                List<Produto> produtos = new ArrayList<>();
                produtos.add(new Produto(1, "Produto 1", 150.0));
                produtos.add(new Produto(2, "Produto 2", 75.0));
                produtos.add(new Produto(3, "Produto 3", 120.0));
                produtos.add(new Produto(4, "Produto 4", 200.0));

                // Convertendo a lista para um Map com ID como chave e Produto como valor
                Map<Integer, Produto> produtosMap = produtos.stream()
                                .collect(Collectors.toMap(Produto::getId, p -> p));

                // Exibindo o conteúdo do Map
                produtosMap.forEach((key, value) -> System.out.println(key + " -> " + value));
        }
}