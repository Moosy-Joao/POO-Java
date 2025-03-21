public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Método para retornar o título em letras maiúsculas
    public String getTituloMaiusculas() {
        return titulo.toUpperCase();
    }

    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        System.out.println(livro.getTituloMaiusculas());
    }
}
