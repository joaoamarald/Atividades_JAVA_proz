/*
NOME: JOÃO PEDRO AMARAL PERDIGÃO
DICIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

package ExercíciosJava_lista03;

import java.util.Arrays;
import java.util.Random;

public class atividade_1 {
    public static void main(String[] args) {
        
    // Array para armazenar os 10 números
    int[] numeros = new int[10];
    Random rnd = new Random();

    // Gerar 10 números aleatórios (de 0 a 9) e armazená-los no vetor
    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = rnd.nextInt(10); // Gera números de 0 a 9
    }

    // Exibir a lista de números obtidos
    System.out.println("Lista com os números obtidos:");
    System.out.println(Arrays.toString(numeros));

    // Ordenar o array em ordem crescente
    Arrays.sort(numeros);
    System.out.println("\nLista em ordem crescente:");
    System.out.println(Arrays.toString(numeros));

    // Exibir a lista em ordem decrescente
    System.out.println("\nLista em ordem decrescente:");
    for (int i = numeros.length - 1; i >= 0; i--) {
        System.out.print(numeros[i] + " ");
    }
    
    }
}

