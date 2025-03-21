public class Vendedor {
    private String nome;
    private double totalVendas;

    // Construtor
    public Vendedor(String nome, double totalVendas) {
        this.nome = nome;
        this.totalVendas = totalVendas;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    @Override
    public String toString() {
        return nome + ": R$ " + totalVendas;
    }
}