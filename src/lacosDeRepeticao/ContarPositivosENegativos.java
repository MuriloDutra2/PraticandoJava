package lacosDeRepeticao;

import java.util.Objects;
import java.util.Scanner;

public class ContarPositivosENegativos {
    public static void main(String[] args) {
        //Ana é professora de matemática e está sempre curiosa sobre as respostas de seus alunos. Hoje, ela propôs um exercício no qual os alunos devem contar quantos números positivos e negativos existem em uma sequência de números fornecida por ela.
        //
        //Ela quer que os alunos criem um programa que permita **inserir vários números, um por vez, e que pare quando o número "fim" for digitado. **

        Scanner scanner = new Scanner(System.in);
        String desisao = " ";

        int positivo = 0;
        int negativo = 0;


        while (!Objects.equals(desisao, "fim")) {
            System.out.println("Digite um número (ou 'fim' para encerrar): ");
            desisao = scanner.nextLine();

            int desisaoInt = Integer.parseInt(desisao);
            if (desisao.equals("fim")) {
                break;
            } else if (desisaoInt  >= 0) {

                positivo++;

            } else {
                negativo++;
            }


        }

        System.out.println( "Números positivos: " + positivo);
        System.out.println("Números negativos: " + negativo);







    }
}
