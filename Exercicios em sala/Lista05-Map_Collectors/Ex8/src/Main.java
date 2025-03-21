import java.util.*;
import java.util.stream.*;

public class Main {
        public static void main(String[] args) {
                List<Pessoa> pessoas = Arrays.asList(
                                new Pessoa("João", 25),
                                new Pessoa("Maria", 30),
                                new Pessoa("Carlos", 40));

                // Criando lista de descrições
                List<String> descricoes = pessoas.stream()
                                .map(Pessoa::getDescricao)
                                .collect(Collectors.toList());
                System.out.println("Descrições das pessoas: " + descricoes);

                // Concatenando todas as descrições
                String texto = pessoas.stream()
                                .map(Pessoa::getDescricao)
                                .collect(Collectors.joining(", "));
                System.out.println("Texto concatenado: " + texto);
        }
}
