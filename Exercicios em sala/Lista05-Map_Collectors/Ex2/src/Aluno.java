public class Aluno {
    private String nome;
    private double nota;
    private int idade;

    // Construtor
    public Aluno(String nome, double nota, int idade) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public int getIdade() {
        return idade;
    }
}
