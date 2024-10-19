/*
NOME: JOÃO PEDRO AMARAL PERDIGÃO
DICIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

package ExercíciosJava_lista01;

import java.util.Scanner;

public class atividade_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Recebe a palavra do usuário
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // Calcula o número de caracteres
        int numCaracteres = palavra.length();

        // Primeira e última letra
        char primeiraLetra = palavra.charAt(0);
        char ultimaLetra = palavra.charAt(numCaracteres - 1);

        // Letra central
        String letraCentral;
        if (numCaracteres % 2 != 0) {
            letraCentral = String.valueOf(palavra.charAt(numCaracteres / 2));
        } else {
            letraCentral = "não há letra central exata";
        }

        // Palavra invertida
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        System.out.println("A palavra digitada foi: " + palavra);
        System.out.println("A palavra tem " + numCaracteres + " dígitos");
        System.out.println("A primeira letra é: " + primeiraLetra);
        System.out.println("A letra central da palavra é: " + letraCentral);
        System.out.println("A última letra é: " + ultimaLetra);
        System.out.println("A palavra escrita ao contrário é: " + palavraInvertida);
        System.out.println("A palavra toda em maiúsculo: " + palavra.toUpperCase());
        System.out.println("A palavra toda em minúsculo: " + palavra.toLowerCase());

        scanner.close();
    }
}
