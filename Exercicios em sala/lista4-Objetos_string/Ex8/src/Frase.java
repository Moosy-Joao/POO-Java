public class Frase {
    private String texto;

    public Frase(String texto) {
        this.texto = texto;
    }

    // Método para retornar o texto ao contrário
    public String textoAoContrario() {
        StringBuilder sb = new StringBuilder(texto);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Frase frase = new Frase("Olá Mundo");
        System.out.println(frase.textoAoContrario());
    }
}
