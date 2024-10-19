/*
NOME: JOÃO PEDRO AMARAL PERDIGÃO
DICIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

package ExercíciosJava_lista01;

import java.util.Scanner;

public class atividade_5 {
    public static void main(String[] args) {

    // Criação do scanner para entrada do usuário
    Scanner scanner = new Scanner(System.in);

    // Recebe a nota do aluno
    System.out.print("Digite a nota (de 0 a 100): ");
    int nota = scanner.nextInt();

    // Verifica se a nota está no intervalo válido
    while (nota < 0 || nota > 100) {
        System.out.print("Nota inválida! Digite uma nota entre 0 e 100: ");
        nota = scanner.nextInt();
    }

    // Determina o conceito baseado na nota
    String conceito;

    if (nota > 90) {
        conceito = "A";
    } else if (nota > 80) {
        conceito = "B";
    } else if (nota > 70) {
        conceito = "C";
    } else if (nota > 60) {
        conceito = "D";
    } else {
        conceito = "E";
    }

    // Exibe o conceito
    System.out.println("O conceito da nota é: " + conceito);

    // Fecha o scanner
    scanner.close();
        	
    }
}
