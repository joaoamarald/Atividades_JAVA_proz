/*
NOME: JOÃO PEDRO AMARAL PERDIGÃO
DICIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

package ExercíciosJava_lista01;

import java.util.Scanner;

public class atividade_4 {
    public static void main(String[] args) {
    
    // Criação do scanner para entrada do usuário
    Scanner scanner = new Scanner(System.in);

    // Array para armazenar as notas
    double[] notas = new double[5];
    double soma = 0.0;

    // Entrada das notas para os 5 alunos
    for (int i = 0; i < 5; i++) {
        System.out.print("Digite a nota do aluno " + (i + 1) + " (de 0 a 10): ");
        notas[i] = scanner.nextDouble();

        // Verifica se a nota está no intervalo válido
        while (notas[i] < 0 || notas[i] > 10) {
            System.out.print("Nota inválida! Digite uma nota entre 0 e 10: ");
            notas[i] = scanner.nextDouble();
        }

        // Soma das notas
        soma += notas[i];
    }

    // Calcula a maior e a menor nota
    double maiorNota = notas[0];
    double menorNota = notas[0];

    for (int i = 1; i < notas.length; i++) {
        if (notas[i] > maiorNota) {
            maiorNota = notas[i];
        }
        if (notas[i] < menorNota) {
            menorNota = notas[i];
        }
    }

    // Calcula a média da turma
    double media = soma / notas.length;

    // Exibe os resultados
    System.out.println("A maior nota é: " + maiorNota);
    System.out.println("A menor nota é: " + menorNota);
    System.out.println("A média da turma é: " + media);

    // Fecha o scanner
    scanner.close();
    
    }
}
