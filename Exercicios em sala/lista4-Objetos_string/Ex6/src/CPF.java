public class CPF {
    private String numeroCPF;

    public CPF(String numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    // Método para formatar o CPF no padrão "XXX.XXX.XXX-XX"
    public String formatarCPF() {
        return numeroCPF.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }

    public static void main(String[] args) {
        CPF cpf = new CPF("12345678901");
        System.out.println(cpf.formatarCPF());
    }
}
