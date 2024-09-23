Gerenciador de Estoque de Hardware
Descrição do Projeto
O Gerenciador de Estoque de Hardware é um sistema desenvolvido para auxiliar no controle de estoque de componentes de hardware, como placas de vídeo, SSDs, HDDs e outros itens relacionados. O sistema permite que os usuários realizem operações de cadastro, consulta, atualização e remoção de produtos no inventário, além de organizar os produtos em categorias e gerenciar fornecedores.

Este projeto foi desenvolvido como parte do trabalho da disciplina Projeto e Arquitetura de Sistemas, com o objetivo de implementar um sistema que aplique padrões de projeto GoF e GRASP.

Funcionalidades
Cadastro de Produtos: Permite adicionar novos produtos ao estoque, incluindo informações como nome, descrição, quantidade, preço, categoria e fornecedor.
Consulta de Produtos: Permite visualizar os produtos cadastrados, incluindo detalhes sobre a quantidade em estoque e o preço.
Atualização de Produtos: Permite editar as informações dos produtos existentes, como quantidade e preço.
Remoção de Produtos: Permite remover produtos que não estão mais disponíveis ou foram descontinuados.
Gestão de Categorias: Organiza os produtos por categorias como "Placas de Vídeo", "Armazenamento", entre outros.
Gestão de Fornecedores: Gerencia informações dos fornecedores de hardware.
Padrões de Projeto
O projeto faz uso dos seguintes padrões de projeto:

GoF - Factory Method: Utilizado para criar os objetos do sistema, como Produto, Fornecedor e Categoria. O padrão garante flexibilidade na criação dos objetos e facilita futuras expansões do sistema.
GRASP - Information Expert: Aplicado na classe Produto, garantindo que ela seja responsável por manipular suas próprias informações (como nome, preço, quantidade, etc.), centralizando o controle de seus dados.
