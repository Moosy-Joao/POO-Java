public class Senha {
    private String valor;

    public Senha(String valor) {
        this.valor = valor;
    }

    // Método para verificar se a senha contém pelo menos um caractere especial
    public boolean temCaractereEspecial() {
        return valor.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
    }

    public static void main(String[] args) {
        Senha senha = new Senha("senha@123");
        System.out.println(senha.temCaractereEspecial());
    }
}
