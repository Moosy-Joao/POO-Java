public class Pedido {
    private int id;
    private String cliente;
    private String status;

    // Construtor
    public Pedido(int id, String cliente, String status) {
        this.id = id;
        this.cliente = cliente;
        this.status = status;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Pedido ID: " + id + ", Cliente: " + cliente + ", Status: " + status;
    }
}
