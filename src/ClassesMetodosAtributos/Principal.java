package ClassesMetodosAtributos;

public class Principal {
    public static void main(String[] args) {


        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Murilo";
        funcionario1.cargo = "Desenvolvedor";
        funcionario1.salario = 10000;

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Ronaldo";
        funcionario2.cargo = "RH";
        funcionario2.salario = 5000;

        funcionario1.ExibirInformacoes();

        funcionario2.reajustarSalario(10);




    }
}
