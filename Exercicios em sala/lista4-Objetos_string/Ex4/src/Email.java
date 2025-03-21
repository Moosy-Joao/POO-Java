public class Email {
    private String remetente;
    private String destinatario;
    private String mensagem;

    public Email(String remetente, String destinatario, String mensagem) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    // Método para contar o número de palavras na mensagem
    public int contarPalavras() {
        String[] palavras = mensagem.split("\\s+");
        return palavras.length;
    }

    public static void main(String[] args) {
        Email email = new Email("joao@exemplo.com", "maria@exemplo.com", "Ola, tudo bem?");
        System.out.println(email.contarPalavras());
    }
}
