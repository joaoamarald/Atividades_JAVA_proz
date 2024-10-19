/*
NOME: JOÃO PEDRO AMARAL PERDIGÃO
DICIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

package ExercíciosJava_lista02;

import java.util.Scanner;

public class atividade_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de elementos da série de Fibonacci: ");
        int n = scanner.nextInt();

        // Verifica se o número de elementos é válido
        if (n <= 0) {
            System.out.println("A quantidade de elementos deve ser maior que zero.");
        } else {
            long[] fibonacci = new long[n];
            
            // Define os dois primeiros elementos
            if (n >= 1) fibonacci[0] = 0;
            if (n >= 2) fibonacci[1] = 1;

            // Calcula os demais elementos da série
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }

            // Exibe a série
            System.out.println("Série Fibonacci com " + n + " elementos:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci[i] + " ");
            }
            System.out.println();
        }
        scanner.close();	
    }
}

