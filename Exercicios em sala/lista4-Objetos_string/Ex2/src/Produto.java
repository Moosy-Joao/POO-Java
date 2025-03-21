public class Produto {
    private String descricao;

    public Produto(String nome, String descricao) {
        this.descricao = descricao;
    }

    public boolean descricaoContemPalavra(String palavra) {
        return descricao.contains(palavra);
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Celular", "Celular de ultima geracao com camera 48MP");
        System.out.println(produto.descricaoContemPalavra("camera"));
    }
}