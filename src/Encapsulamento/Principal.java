package Encapsulamento;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

//        Funcionario funcionario = new Funcionario("Dutra", 8500);
//
//        funcionario.setCargo("Desenvolvedor");
//
//        System.out.println( "Funcionario tem o cargo: " +funcionario.getCargo());
//        System.out.println( "Funcionario tem o nome: " + funcionario.getNome());
//        System.out.println( "Funcionario tem o Salario: " +funcionario.getSalario());
//
//
//        funcionario.reajustarSalario(5);
//        funcionario.reajustarSalario(10);
//
//        funcionario.ExibirInformacoes();


        //Cadastro de veiculos:

//        CadastroDeVeiculos cadastroDeVeiculos =  new CadastroDeVeiculos("Uno", "ABC-1234", 2000);
//
//        cadastroDeVeiculos.ExibirInformacoes();

        //AgendaDeContatos

        ArrayList<AgendaDeContatos> Contatos = new ArrayList<>();

        Contatos.add(new AgendaDeContatos("Murilo", "(21)123478952"));
        Contatos.add(new AgendaDeContatos("Nunes", "(25)2165413213"));
        Contatos.add(new AgendaDeContatos("Dutra", "(11)2315415623"));
        int cont = 0;
        for (AgendaDeContatos A : Contatos) {
            cont++;
            System.out.println(cont + ". " + A.getNome() + " - " + A.getNumero());

        }

    }
}
