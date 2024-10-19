
/*
NOME: JOÃO PEDRO AMARAL PERDIGÃO
DICIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

package ExercíciosJava_lista01;

import java.util.Scanner;

public class atividade_2 {
    public static void main(String[] args) {
        	
        // Criação do scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebe o número do usuário
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verifica se o número é par ou ímpar
        String parOuImpar = (numero % 2 == 0) ? "par" : "ímpar";

        // Verifica se o número é positivo, negativo ou zero
        String positivoOuNegativo;
        if (numero > 0) {
            positivoOuNegativo = "positivo";
        } else if (numero < 0) {
            positivoOuNegativo = "negativo";
        } else {
            positivoOuNegativo = "zero";
        }

        // Verifica se o número é primo
        boolean ehPrimo = true;
        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        // Calcula a raiz quadrada do número
        double raizQuadrada = Math.sqrt(numero);

        // Calcula o número elevado a 3
        int numeroElevado3 = numero * numero * numero;

        // Exibe os resultados
        System.out.println("O número é: " + numero);
        System.out.println("O número é " + parOuImpar);
        System.out.println("O número é " + positivoOuNegativo);
        System.out.println("O número é primo: " + (ehPrimo ? "sim" : "não"));
        System.out.println("A raiz quadrada do número é: " + raizQuadrada);
        System.out.println("O número elevado a 3 é: " + numeroElevado3);

        // Fecha o scanner
        scanner.close();

    }
}