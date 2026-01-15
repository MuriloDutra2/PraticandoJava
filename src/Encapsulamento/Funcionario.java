package Encapsulamento;



public class Funcionario {

   private String nome;
    private String cargo;
    private  double salario;

    private int controleDeReajuste = 0;


    public Funcionario(String nome,  double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void ExibirInformacoes() {
        System.out.printf("Funcionario %s - Cargo %s - Salario %.2f \n",
                nome, cargo, salario);
    }

    public void reajustarSalario(double percentual) {
        if(controleDeReajuste >= 1) {
            System.out.println("Não pode fazer reajuste (limite)");
        } else {
            controleDeReajuste++;
            salario += salario * (percentual / 100);
            System.out.printf("Novo Salario de: %s  é %.2f  \n",
                    nome,salario);
        }


    }

}
