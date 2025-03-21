public abstract class ItemLoja implements Vendavel {
    private int id;
    private String nome;

    public ItemLoja(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Método abstrato para retornar o preço
    public abstract double getPreco();
}
