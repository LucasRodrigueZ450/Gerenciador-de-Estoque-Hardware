package estoque_hardware;

import java.util.ArrayList;
import java.util.List;

public class EstoqueService {
    private List<Produto> produtos = new ArrayList<>();

    // Método para adicionar produto ao estoque
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto.getNome());
    }

    // Método para listar produtos
    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto.getId() + " - " + produto.getNome() + " | Quantidade: " + produto.getQuantidade() + " | Preço: R$" + produto.getPreco());
        }
    }

    // Método para atualizar produto
    public void atualizarProduto(int id, Produto produtoAtualizado) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produto.setNome(produtoAtualizado.getNome());
                produto.setDescricao(produtoAtualizado.getDescricao());
                produto.setQuantidade(produtoAtualizado.getQuantidade());
                produto.setPreco(produtoAtualizado.getPreco());
                produto.setCategoria(produtoAtualizado.getCategoria());
                produto.setFornecedor(produtoAtualizado.getFornecedor());
                System.out.println("Produto atualizado: " + produto.getNome());
                return;
            }
        }
        System.out.println("Produto com ID " + id + " não encontrado.");
    }

    // Método para remover produto do estoque
    public void removerProduto(int id) {
        produtos.removeIf(produto -> produto.getId() == id);
        System.out.println("Produto removido.");
    }

    // Método para retornar a lista de produtos
    public List<Produto> getProdutos() {
        return produtos;
    }
    
}
