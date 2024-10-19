/*
NOME: JOÃO PEDRO AMARAL PERDIGÃO
DICIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

package ExercíciosJava_lista02;

import java.util.Random;
import java.util.Scanner;

public class atividade_5 {
    public static void main(String[] args) {
    
    // Gera o número aleatório entre 0 e 9
        Random rnd = new Random();
        int numeroAleatorio = rnd.nextInt(10); // Gera um número de 0 a 9

        Scanner scanner = new Scanner(System.in);
        int tentativa;

        System.out.println("Tente adivinhar o número (entre 0 e 9)");

        // Laço de repetição para adivinhar o número
        while (true) {
            System.out.print("Digite o seu palpite: ");
            tentativa = scanner.nextInt();

            if (tentativa == numeroAleatorio) {
                System.out.println("ACERTOU!");
                break; // Sai do laço quando o número é acertado
            } else if (tentativa < numeroAleatorio) {
                System.out.println("MAIOR");
            } else {
                System.out.println("MENOR");
            }
        }

        scanner.close();

    }
}

