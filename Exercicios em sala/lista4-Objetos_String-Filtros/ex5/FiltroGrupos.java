import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FiltroGrupos {

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

    // Classe Funcionario
    public static class Funcionario extends Pessoa {
        private double salario;
        private String departamento;

        public Funcionario(String nome, int idade, double salario, String departamento) {
            super(nome, idade);
            this.salario = salario;
            this.departamento = departamento;
        }

        public double getSalario() {
            return salario;
        }

        public String getDepartamento() {
            return departamento;
        }
    }

    public static void main(String[] args) {
        // Criação da lista de funcionários
        List<Funcionario> funcionarios = new ArrayList<>();

        // Adicionando alguns funcionários à lista
        funcionarios.add(new Funcionario("João", 30, 3500.00, "TI"));
        funcionarios.add(new Funcionario("Maria", 25, 5000.00, "Marketing"));
        funcionarios.add(new Funcionario("Carlos", 40, 4500.00, "TI"));
        funcionarios.add(new Funcionario("Ana", 35, 2000.00, "Vendas"));
        funcionarios.add(new Funcionario("Lucas", 28, 4000.00, "Marketing"));

        // Filtrando os funcionários com salário entre 2000 e 5000 e agrupando por
        // departamento
        Map<String, List<Funcionario>> funcionariosAgrupados = funcionarios.stream()
                .filter(f -> f.getSalario() >= 2000 && f.getSalario() <= 5000) // Filtra pela faixa salarial
                .collect(Collectors.groupingBy(Funcionario::getDepartamento)); // Agrupa por departamento

        // Exibindo os resultados agrupados
        funcionariosAgrupados.forEach((departamento, listaFuncionarios) -> {
            System.out.println("Departamento: " + departamento);
            listaFuncionarios.forEach(funcionario -> {
                System.out.println("  Nome: " + funcionario.getNome() + ", Salário: R$" + funcionario.getSalario());
            });
            System.out.println();
        });
    }
}
