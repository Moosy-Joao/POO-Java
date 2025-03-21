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

// Classe Funcionario
class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}

// Classe Principal para execução
public class FiltrarFuncionarios {
    public static void main(String[] args) {
        // Criando lista de funcionários
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Ana", 30, 4500));
        funcionarios.add(new Funcionario("Bruno", 40, 7000));
        funcionarios.add(new Funcionario("Carlos", 35, 5500));
        funcionarios.add(new Funcionario("Diana", 28, 4800));
        funcionarios.add(new Funcionario("Eduardo", 50, 9000));

        // Filtrando funcionários com salário acima de R$ 5000 e ordenando por salário
        // decrescente
        List<Funcionario> funcionariosFiltrados = funcionarios.stream()
                .filter(funcionario -> funcionario.getSalario() > 5000)
                .sorted((f1, f2) -> Double.compare(f2.getSalario(), f1.getSalario()))
                .collect(Collectors.toList());

        // Exibindo os funcionários filtrados e ordenados
        System.out.println("Funcionários com salário acima de R$ 5000:");
        funcionariosFiltrados.forEach(
                funcionario -> System.out.println(funcionario.getNome() + " - R$ " + funcionario.getSalario()));
    }
}
