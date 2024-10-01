package estoque_hardware;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EstoqueService estoqueService = new EstoqueService();
        ProdutoFactory produtoFactory = new ProdutoConcretoFactory(); // Instanciando a fábrica de produtos
        Scanner scanner = new Scanner(System.in).useLocale(java.util.Locale.US);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Editar produto");
            System.out.println("3. Remover produto");
            System.out.println("4. Listar produtos");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpa o buffer

            switch (opcao) {
                case 1:
                    // Adicionar produto
                    System.out.println("Digite as informações do produto no formato:");
                    System.out.println("nome,descrição,quantidade,preço,categoria");

                    String[] dados = scanner.nextLine().split(",");
                    Categoria categoria = new Categoria(1, dados[4]);

                    // Criando o produto via Factory
                    Produto novoProduto = produtoFactory.criarProduto(dados[0], dados[1], Integer.parseInt(dados[2]), Double.parseDouble(dados[3]), categoria);
                    estoqueService.adicionarProduto(novoProduto);
                    break;

                case 2:
                    // Editar produto
                    System.out.println("Digite o ID do produto a ser editado:");
                    int idEditar = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    System.out.println("Digite as novas informações do produto no formato:");
                    System.out.println("nome,descrição,quantidade,preço,categoria");

                    String[] novosDados = scanner.nextLine().split(",");
                    Categoria novaCategoria = new Categoria(1, novosDados[4]);

                    Produto produtoEditado = new Produto(idEditar, novosDados[0], novosDados[1], Integer.parseInt(novosDados[2]), Double.parseDouble(novosDados[3]), novaCategoria, null);
                    estoqueService.atualizarProduto(idEditar, produtoEditado);
                    break;

                case 3:
                    // Remover produto
                    System.out.println("Digite o ID do produto a ser removido:");
                    int idRemover = scanner.nextInt();
                    estoqueService.removerProduto(idRemover);
                    break;

                case 4:
                    // Listar produtos
                    estoqueService.listarProdutos();
                    break;

                case 5:
                    // Sair
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}