public class Pessoa {
    private String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    // Método para retornar o nome completo
    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", "Pereira");
        System.out.println(pessoa.getNomeCompleto());
    }
}
