/*
NOME: JOÃO PEDRO AMARAL PERDIGÃO
DICIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

package ExercíciosJava_lista04;

class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    // Construtor
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Métodos para acessar e alterar os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para aplicar um reajuste percentual sobre o salário
    public double aplicarReajuste(double percentual) {
        salario += salario * (percentual / 100);
        return salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Cargo: " + cargo + ", Salário: R$ " + String.format("%.2f", salario);
    }
}

public class atividade_3 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Carlos Santos", "Analista", 3500.00);
        Funcionario funcionario2 = new Funcionario("Ana Lima", "Gerente", 6000.00);

        System.out.println("Dados dos Funcionários:");
        System.out.println(funcionario1);
        System.out.println(funcionario2);

        // Aplicando reajuste
        double percentualReajuste = 10; // 10%
        System.out.println("\nAplicando reajuste de " + percentualReajuste + "% no salário de " + funcionario1.getNome());
        double novoSalario = funcionario1.aplicarReajuste(percentualReajuste);
        System.out.println("Novo salário: R$ " + String.format("%.2f", novoSalario));

        // Alterando dados do funcionário2
        funcionario2.setCargo("Diretor");
        funcionario2.setSalario(8000.00);

        System.out.println("\nApós alteração:");
        System.out.println(funcionario2);
    }
}

