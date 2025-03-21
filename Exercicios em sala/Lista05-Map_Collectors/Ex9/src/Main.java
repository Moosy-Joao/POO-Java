import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // Criando o ArrayList de Produtos
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1, "Produto 1", 100.0));
        produtos.add(new Produto(2, "Produto 2", 150.0));
        produtos.add(new Produto(3, "Produto 3", 200.0));

        // Convertendo para Map com o id como chave
        Map<Integer, Produto> produtoMap = produtos.stream()
                .collect(Collectors.toMap(Produto::getId, p -> p));

        // Exibindo o Map
        produtoMap.forEach((id, produto) -> System.out.println("ID: " + id + ", Produto: " + produto.getNome()));
    }
}
