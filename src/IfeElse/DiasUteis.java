package IfeElse;

import java.util.Scanner;

public class DiasUteis {
    //Carlos trabalha em uma empresa de logística que opera apenas de segunda a sexta, sem atividades nos finais de semana. Para evitar confusões, ele precisa de um programa que, ao receber um dia da semana, informe se é um dia útil ou não.
    //
    //Crie um programa que receba um dia da semana (em letras minúsculas) e exiba uma mensagem indicando se é um dia útil ou não.


    public static void main(String[] args) {

        Scanner  leitor = new Scanner(System.in);

        System.out.println("Digite o dia da semana(em letras minúsculas): ");
        String dia = leitor.next();

        if (dia.equals("segunda") ||dia.equals("terça")|| dia.equals("quarta") || dia.equals("quinta") || dia.equals("sexta") ) {
            System.out.println("é um dia útil ");
        } else if (dia.equals("sabado") || dia.equals("domingo")){
            System.out.println("Não é dia útil");
        } else {
            System.out.println("Não é dia");
        }

        leitor.close();




    }
}
