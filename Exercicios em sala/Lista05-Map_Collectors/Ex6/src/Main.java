import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = Arrays.asList(
                new Cliente("João", 25),
                new Cliente("Maria", 35),
                new Cliente("Carlos", 19));

        // Filtrando clientes com mais de 18 anos
        List<Cliente> maioresDe18 = clientes.stream()
                .filter(cliente -> cliente.getIdade() > 18)
                .collect(Collectors.toList());
        System.out.println("Clientes maiores de 18: " + maioresDe18.size());

        // Contando quantos têm mais de 30 anos
        long maisDe30 = clientes.stream()
                .filter(cliente -> cliente.getIdade() > 30)
                .count();
        System.out.println("Clientes com mais de 30 anos: " + maisDe30);

        // Criando lista de nomes
        List<String> nomes = clientes.stream()
                .map(Cliente::getNome)
                .collect(Collectors.toList());
        System.out.println("Nomes dos clientes: " + nomes);
    }
}
