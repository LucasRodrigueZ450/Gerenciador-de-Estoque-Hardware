package estoque_hardware;

public class Main {
    public static void main(String[] args){
        EstoqueService estoqueService = new EstoqueService();

        // criando categoria
        Categoria categoria1 = new Categoria(1, "Placa de vídeo AMD");
        Categoria categoria2 = new Categoria(2, "SSD 1 TB Kingston NV2");

        // criando fornecedor
        Fornecedor forncedor1 = new Fornecedor(1, "Kabum", "Rua B, 123", "1111-2222", "contato@kabum.br");
        Fornecedor forncedor2 = new Fornecedor(2, "Pichau", "Rua c, 123", "1111-3333", "contato@pichau.br");

        //criar produtos
        Produto produto1 = new Produto(1, "Radeon RX 6600", "EAGLE AMD, 8GB GDDR6", 10, 1459.99, categoria1, forncedor1);
        Produto produto2 = new Produto(2, "Kingston NV2 1TB", "SSD 1 TB Kingston NV2", 5, 299.99, categoria2, forncedor2);

        estoqueService.adcionarProduto(produto1);
        estoqueService.adcionarProduto(produto2);
 
        estoqueService.listarProdutos();

        Produto produtoAtualizado = new Produto(1, "GTX 1060", "Placa de video atualizada", 8, 1599.00, categoria1, forncedor1);
        estoqueService.atualizarProduto(1, produtoAtualizado);

        //remover produto
        estoqueService.removerProduto(1);

        // listar os produtos
        estoqueService.listarProdutos();
    }
}
