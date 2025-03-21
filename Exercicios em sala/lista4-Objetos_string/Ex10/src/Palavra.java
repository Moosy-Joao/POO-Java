public class Palavra {
    private String conteudo;

    public Palavra(String conteudo) {
        this.conteudo = conteudo;
    }

    // Método para retornar a quantidade de vogais
    public int contarVogais() {
        int count = 0;
        for (char c : conteudo.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Palavra palavra = new Palavra("exemplo");
        System.out.println(palavra.contarVogais());
    }
}
