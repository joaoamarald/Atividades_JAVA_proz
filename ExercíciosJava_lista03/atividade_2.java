/*
NOME: JOÃO PEDRO AMARAL PERDIGÃO
DICIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

package ExercíciosJava_lista03;

import java.util.Scanner;

public class atividade_2 {

    // Tamanho máximo do cadastro
    static final int MAX_PESSOAS = 100;
    static int contadorPessoas = 0;

    // Matriz para armazenar os dados das pessoas
    static String[][] cadastro = new String[MAX_PESSOAS][3]; // [ID, Nome, Data de Nascimento]

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Exibe o menu de opções
            System.out.println("\n--- MENU ---");
            System.out.println("1. Inserir pessoa");
            System.out.println("2. Alterar dados de uma pessoa");
            System.out.println("3. Consultar dados de uma pessoa");
            System.out.println("4. Excluir dados de uma pessoa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    inserirPessoa(scanner);
                    break;
                case 2:
                    alterarPessoa(scanner);
                    break;
                case 3:
                    consultarPessoa(scanner);
                    break;
                case 4:
                    excluirPessoa(scanner);
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    // Função para inserir uma nova pessoa
    public static void inserirPessoa(Scanner scanner) {
        if (contadorPessoas >= MAX_PESSOAS) {
            System.out.println("Cadastro cheio! Não é possível inserir mais pessoas.");
            return;
        }

        // Gerar ID da pessoa automaticamente
        String id = Integer.toString(contadorPessoas + 1);
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a data de nascimento (dd/mm/aaaa): ");
        String dataNascimento = scanner.nextLine();

        // Armazena os dados no cadastro
        cadastro[contadorPessoas][0] = id;
        cadastro[contadorPessoas][1] = nome;
        cadastro[contadorPessoas][2] = dataNascimento;

        contadorPessoas++;
        System.out.println("Pessoa cadastrada com sucesso!");
    }

    // Função para alterar os dados de uma pessoa
    public static void alterarPessoa(Scanner scanner) {
        System.out.print("Digite o ID da pessoa que deseja alterar: ");
        String id = scanner.nextLine();

        int indice = encontrarPessoaPorId(id);
        if (indice == -1) {
            System.out.println("Pessoa não encontrada.");
            return;
        }

        System.out.print("Digite o novo nome da pessoa: ");
        String novoNome = scanner.nextLine();
        System.out.print("Digite a nova data de nascimento (dd/mm/aaaa): ");
        String novaDataNascimento = scanner.nextLine();

        cadastro[indice][1] = novoNome;
        cadastro[indice][2] = novaDataNascimento;

        System.out.println("Dados da pessoa alterados com sucesso!");
    }

    // Função para consultar os dados de uma pessoa
    public static void consultarPessoa(Scanner scanner) {
        System.out.print("Digite o ID da pessoa que deseja consultar: ");
        String id = scanner.nextLine();

        int indice = encontrarPessoaPorId(id);
        if (indice == -1) {
            System.out.println("Pessoa não encontrada.");
            return;
        }

        System.out.println("Dados da pessoa:");
        System.out.println("ID: " + cadastro[indice][0]);
        System.out.println("Nome: " + cadastro[indice][1]);
        System.out.println("Data de Nascimento: " + cadastro[indice][2]);
    }

    // Função para excluir os dados de uma pessoa
    public static void excluirPessoa(Scanner scanner) {
        System.out.print("Digite o ID da pessoa que deseja excluir: ");
        String id = scanner.nextLine();

        int indice = encontrarPessoaPorId(id);
        if (indice == -1) {
            System.out.println("Pessoa não encontrada.");
            return;
        }

        // Excluir a pessoa (simplesmente definimos os dados como nulos)
        for (int i = 0; i < 3; i++) {
            cadastro[indice][i] = null;
        }

        System.out.println("Dados da pessoa excluídos com sucesso!");
    }

    // Função auxiliar para encontrar o índice de uma pessoa pelo ID
    public static int encontrarPessoaPorId(String id) {
        for (int i = 0; i < contadorPessoas; i++) {
            if (cadastro[i][0] != null && cadastro[i][0].equals(id)) {
                return i;
            }
        }
        return -1; // Se não encontrar, retorna -1
    }
}


