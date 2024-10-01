package estoque_hardware;

// Implementação do Factory para criar produtos concretos
public class ProdutoConcretoFactory implements ProdutoFactory {
    private static int contadorId = 1;

    @Override
    public Produto criarProduto(String nome, String descricao, int quantidade, double preco, Categoria categoria) {
        Produto produto = new Produto(contadorId++, nome, descricao, quantidade, preco, categoria, null);
        return produto;
    }
}
