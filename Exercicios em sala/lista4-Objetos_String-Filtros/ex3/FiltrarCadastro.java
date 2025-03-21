import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrarCadastro {

    // Interface Entidade
    public interface Entidade {
        String getNome();
    }

    // Classe Abstrata Pessoa
    public static abstract class Pessoa implements Entidade {
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
    public static class Cliente extends Pessoa {
        private LocalDate dataCadastro;

        public Cliente(String nome, int idade, LocalDate dataCadastro) {
            super(nome, idade); // Chama o construtor da classe Pessoa
            this.dataCadastro = dataCadastro;
        }

        public LocalDate getDataCadastro() {
            return dataCadastro;
        }

        public long getTempoCadastro() {
            return ChronoUnit.YEARS.between(dataCadastro, LocalDate.now());
        }
    }

    public static void main(String[] args) {
        // Criação de uma lista de clientes
        List<Cliente> clientes = new ArrayList<>();

        // Adicionando alguns clientes à lista
        clientes.add(new Cliente("João", 30, LocalDate.of(2015, 3, 21)));
        clientes.add(new Cliente("Maria", 40, LocalDate.of(2019, 5, 10)));
        clientes.add(new Cliente("Carlos", 25, LocalDate.of(2010, 7, 15)));
        clientes.add(new Cliente("Ana", 35, LocalDate.of(2017, 11, 30)));

        // Filtrando os clientes com mais de 5 anos de cadastro
        List<Cliente> clientesFiltrados = clientes.stream()
                .filter(cliente -> cliente.getTempoCadastro() > 5)
                .collect(Collectors.toList());

        // Exibindo os resultados
        clientesFiltrados.forEach(cliente -> {
            System.out.println(
                    "Nome: " + cliente.getNome() + ", Tempo de Cadastro: " + cliente.getTempoCadastro() + " anos");
        });
    }
}
