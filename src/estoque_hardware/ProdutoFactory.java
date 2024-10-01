package estoque_hardware;

// Interface Factory para criar produtos
public interface ProdutoFactory {
    Produto criarProduto(String nome, String descricao, int quantidade, double preco, Categoria categoria);
}
