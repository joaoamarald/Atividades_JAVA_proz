/*
NOME: JOÃO PEDRO AMARAL PERDIGÃO
DICIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

package ExercíciosJava_lista01;

import java.util.Scanner;

public class atividade_3 {
    public static void main(String[] args) {
        	
    // Criação do scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebe o valor cheio da compra
        System.out.print("Digite o valor cheio da compra: R$ ");
        double valorCheio = scanner.nextDouble();

        // Recebe o valor do desconto (em porcentagem)
        System.out.print("Digite o valor do desconto (em %): ");
        double desconto = scanner.nextDouble();

        // Calcula o valor do desconto em reais
        double valorDesconto = valorCheio * (desconto / 100);

        // Calcula o novo valor após o desconto
        double novoValor = valorCheio - valorDesconto;

        // Exibe os resultados
        System.out.println("O valor cheio é: R$ " + valorCheio);
        System.out.println("O valor do desconto é: R$ " + valorDesconto);
        System.out.println("O novo valor é: R$ " + novoValor);

        // Fecha o scanner
        scanner.close();
        
    }
}