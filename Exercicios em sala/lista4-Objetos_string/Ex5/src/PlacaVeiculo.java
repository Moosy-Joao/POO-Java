public class PlacaVeiculo {
    private String codigoPlaca;

    public PlacaVeiculo(String codigoPlaca) {
        this.codigoPlaca = codigoPlaca;
    }

    // Método para validar se a placa segue o padrão "AAA-9999"
    public boolean validarPlaca() {
        return codigoPlaca.matches("[A-Za-z]{3}-\\d{4}");
    }

    public static void main(String[] args) {
        PlacaVeiculo placa = new PlacaVeiculo("ABC-1234");
        System.out.println(placa.validarPlaca());
    }
}
