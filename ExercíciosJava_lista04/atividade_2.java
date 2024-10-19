/*
NOME: JOÃO PEDRO AMARAL PERDIGÃO
DICIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

package ExercíciosJava_lista04;

class Aluno {
    private String nome;
    private double nota;

    // Construtor
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    // Métodos para acessar e alterar os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Método para retornar o conceito da nota
    public String obterConceito() {
        if (nota >= 90) {
            return "A";
        } else if (nota >= 80) {
            return "B";
        } else if (nota >= 70) {
            return "C";
        } else if (nota >= 60) {
            return "D";
        } else {
            return "E";
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Nota: " + nota + ", Conceito: " + obterConceito();
    }
}

public class atividade_2 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João Silva", 85.0);
        Aluno aluno2 = new Aluno("Maria Oliveira", 92.5);
        
        System.out.println(aluno1);
        System.out.println(aluno2);

        // Alterando os dados do aluno1
        aluno1.setNota(75.0);
        aluno1.setNome("João da Silva");

        System.out.println("Após alteração:");
        System.out.println(aluno1);
    }
}


