package estoque_hardware;

import java.util.ArrayList;
import java.util.List;

public class EstoqueService {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto.getNome());
    }


    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto.getId() + " - " + produto.getNome() + " | Quantidade: " + produto.getQuantidade() + " | Preço: R$" + produto.getPreco());
        }
    }


    public void atualizarProduto(int id, Produto produtoAtualizado){
        for ( Produto produto : produtos){
            if ( produto.getId() == id){
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

        System.out.println("Produto não encontrado");
    }

    public void removerProduto(int id){
        produtos.removeIf(produto -> produto.getId() == id);
        System.out.println("Produto removido. ");
    }
}
