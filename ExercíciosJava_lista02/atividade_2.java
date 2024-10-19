/*
NOME: JOÃO PEDRO AMARAL PERDIGÃO
DICIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

package ExercíciosJava_lista02;

import java.util.Scanner;

public class atividade_2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o valor de A: ");
            double A = scanner.nextDouble();
            System.out.print("Digite o valor de B: ");
            double B = scanner.nextDouble();
            System.out.print("Digite o valor de C: ");
            double C = scanner.nextDouble();

            // Regra de três: A está para B assim como C está para X => X = (B * C) / A
            double X = (B * C) / A;
            System.out.println("O valor de X é: " + X);

            // Pergunta se o usuário deseja continuar
            System.out.print("Deseja continuar? Digite 'S' para continuar ou 'N' para sair: ");
            char opcao = scanner.next().charAt(0);
            if (opcao == 'N' || opcao == 'n') {
                continuar = false;
                System.out.println("Encerrando...");
            }
        }
        scanner.close();
    }
}

