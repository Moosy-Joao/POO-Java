package ex2;

public class Funcionarios extends Pessoa {
    public double salario;

    public Funcionarios(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

        public void mostrarDetalhes() {
        // Exibe os detalhes do funcionário, incluindo nome, idade e salário
        System.out.println("Nome: " + getNome() + ", Idade: " + getIdade() + getSalario() + ", Salário: R$ " + salario);
    }

}
