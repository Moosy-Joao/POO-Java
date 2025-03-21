import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Interface Entidade
interface Entidade {
    String getNome();
}

// Classe Abstrata Pessoa
abstract class Pessoa implements Entidade {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

// Classe Cliente
class Cliente extends Pessoa {
    public Cliente(String nome, int idade) {
        super(nome, idade);
    }
}

// Classe Main
public class FiltrarClientes {
    public static void main(String[] args) {
        // Criando lista de clientes
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Ana", 25));
        clientes.add(new Cliente("Bruno", 35));
        clientes.add(new Cliente("Carlos", 40));
        clientes.add(new Cliente("Diana", 29));
        clientes.add(new Cliente("Eduardo", 32));

        // Filtrando clientes com idade acima de 30 anos
        List<Cliente> clientesFiltrados = clientes.stream()
                .filter(cliente -> cliente.getIdade() > 30)
                .collect(Collectors.toList());

        // Exibindo os clientes filtrados
        System.out.println("Clientes com idade acima de 30 anos:");
        clientesFiltrados.forEach(cliente -> System.out.println(cliente.getNome()));
    }
}
