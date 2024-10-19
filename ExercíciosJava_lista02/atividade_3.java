/*
NOME: JOÃO PEDRO AMARAL PERDIGÃO
DICIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

package ExercíciosJava_lista02;

public class atividade_3 {
    public static void main(String[] args) {
        System.out.println("Números entre 1 e 1000 que divididos por 11 têm resto 5:");
        for (int i = 1; i <= 1000; i++) {
            if (i % 11 == 5) {
                System.out.println(i);
            }
        }
    }
}

