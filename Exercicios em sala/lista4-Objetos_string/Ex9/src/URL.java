public class URL {
    private String endereco;

    public URL(String endereco) {
        this.endereco = endereco;
    }

    // Método para verificar se a URL começa com "https://"
    public boolean verificaHTTPS() {
        return endereco.startsWith("https://");
    }

    public static void main(String[] args) {
        URL url = new URL("https://www.exemplo.com");
        System.out.println(url.verificaHTTPS());
    }
}
