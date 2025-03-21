import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroProdutos {

    // Interface Entidade
    public interface Entidade {
        String getNome();
    }

    // Classe Abstrata ProdutoBase
    public static abstract class ProdutoBase implements Entidade {
        protected String nome;
        protected int quantidadeEmEstoque;

        public ProdutoBase(String nome, int quantidadeEmEstoque) {
            this.nome = nome;
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }

        @Override
        public String getNome() {
            return nome;
        }

        public int getQuantidadeEmEstoque() {
            return quantidadeEmEstoque;
        }

        // Método para verificar se o produto está em estoque
        public boolean estaEmEstoque() {
            return quantidadeEmEstoque > 0;
        }
    }

    // Classe Produto
    public static class Produto extends ProdutoBase {
        private double preco;

        public Produto(String nome, int quantidadeEmEstoque, double preco) {
            super(nome, quantidadeEmEstoque);
            this.preco = preco;
        }

        public double getPreco() {
            return preco;
        }
    }

    public static void main(String[] args) {
        // Criação de uma lista de produtos
        List<Produto> produtos = new ArrayList<>();

        // Adicionando alguns produtos à lista
        produtos.add(new Produto("Produto A", 10, 50.00));
        produtos.add(new Produto("Produto B", 0, 30.00));
        produtos.add(new Produto("Produto C", 5, 20.00));
        produtos.add(new Produto("Produto D", 3, 40.00));

        // Filtrando os produtos que estão em estoque e ordenando pelo preço
        List<Produto> produtosFiltrados = produtos.stream()
                .filter(Produto::estaEmEstoque) // Filtra os produtos em estoque
                .sorted((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco())) // Ordena pelo preço de forma
                                                                                  // crescente
                .collect(Collectors.toList());

        // Exibindo os resultados
        produtosFiltrados.forEach(produto -> {
            System.out.println("Nome: " + produto.getNome() + ", Quantidade em Estoque: "
                    + produto.getQuantidadeEmEstoque() + ", Preço: R$" + produto.getPreco());
        });
    }
}
