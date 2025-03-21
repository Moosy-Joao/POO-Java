import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de produtos
        List<ItemLoja> produtos = Arrays.asList(
                new Eletronico(1, "Celular", 1500.00),
                new Roupas(2, "Camiseta", 50.00),
                new Eletronico(3, "Laptop", 2500.00),
                new Roupas(4, "Calça", 120.00),
                new Eletronico(5, "Fone de ouvido", 99.00));

        // Filtrando os produtos com preço maior que 100 e mapeando para os nomes
        List<String> nomesProdutos = produtos.stream()
                .filter(produto -> produto.getPreco() > 100.00) // Filtra os produtos com preço acima de R$ 100
                .map(ItemLoja::getNome) // Mapeia para uma lista de nomes
                .collect(Collectors.toList()); // Coleta o resultado em uma lista

        // Exibindo a lista de nomes
        nomesProdutos.forEach(System.out::println);
    }
}
