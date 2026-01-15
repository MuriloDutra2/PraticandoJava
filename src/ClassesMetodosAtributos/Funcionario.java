package ClassesMetodosAtributos;

public class Funcionario {

    String nome;
    String cargo;
    double salario;


    public void ExibirInformacoes() {
        System.out.printf("Funcionario %s - Cargo %s - Salario %.2f \n",
                nome, cargo, salario);
    }

    public void reajustarSalario(double percentual) {
        salario += salario * (percentual / 100);
        System.out.printf("Novo Salario de: %s  é %.2f \n",
                nome,salario);
    }

}
