import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Criação da lista de livros
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("Java para Iniciantes", "John Doe", 39.90));
        livros.add(new Livro("Mastering Java", "Jane Smith", 59.90));
        livros.add(new Livro("O Guia do Programador", "Carlos Silva", 29.90));
        livros.add(new Livro("Programação em Java", "Ana Souza", 49.90));

        // Ordenar por preço em ordem crescente e, em caso de empate, por autor em ordem
        // alfabética
        List<Livro> livrosOrdenados = livros.stream()
                .sorted((l1, l2) -> {
                    int precoCompare = Double.compare(l1.getPreco(), l2.getPreco());
                    if (precoCompare != 0) {
                        return precoCompare; // Ordena por preço em ordem crescente
                    }
                    return l1.getAutor().compareTo(l2.getAutor()); // Se os preços forem iguais, ordena por autor
                })
                .collect(Collectors.toList());

        // Criar uma lista intermediária contendo apenas os títulos dos livros
        List<String> titulos = livrosOrdenados.stream()
                .map(Livro::getTitulo)
                .collect(Collectors.toList());

        // Criar uma string única contendo os títulos separados por " | "
        String titulosConcatenados = titulos.stream()
                .collect(Collectors.joining(" | "));

        // Exibir a lista de títulos ordenados
        System.out.println("Livros ordenados por preço e autor:");
        for (String titulo : titulosConcatenados.split(" \\| ")) {
            System.out.println(titulo);
        }

        // Exibir os títulos concatenados em uma única string
        System.out.println("\nTítulos concatenados:");
        System.out.println(titulosConcatenados);
    }
}
