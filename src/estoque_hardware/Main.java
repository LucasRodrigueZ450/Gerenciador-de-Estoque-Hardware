package estoque_hardware;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EstoqueService estoqueService = new EstoqueService();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o nome do produto:");
        String nomeProduto = scanner.nextLine();

        System.out.println("Digite a descrição do produto:");
        String descricaoProduto = scanner.nextLine();

        System.out.println("Digite a quantidade do produto:");
        int quantidadeProduto = scanner.nextInt();

        System.out.println("Digite o preço do produto:");
        double precoProduto = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Digite a categoria do produto:");
        String nomeCategoria = scanner.nextLine();

        System.out.println("Digite o nome do fornecedor:");
        String nomeFornecedor = scanner.nextLine();

        System.out.println("Digite o endereço do fornecedor:");
        String enderecoFornecedor = scanner.nextLine();

        System.out.println("Digite o telefone do fornecedor:");
        String telefoneFornecedor = scanner.nextLine();

        System.out.println("Digite o email do fornecedor:");
        String emailFornecedor = scanner.nextLine();

        Categoria categoria = new Categoria(1, nomeCategoria);
        Fornecedor fornecedor = new Fornecedor(1, nomeFornecedor, enderecoFornecedor, telefoneFornecedor, emailFornecedor);


        Produto novoProduto = new Produto(1, nomeProduto, descricaoProduto, quantidadeProduto, precoProduto, categoria, fornecedor);


        estoqueService.adicionarProduto(novoProduto);

        estoqueService.listarProdutos();

        scanner.close();
    }
}
