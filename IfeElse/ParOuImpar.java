package IfeElse;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

//        Ana precisa identificar se um número é par ou
//        ímpar para um jogo que está desenvolvendo. Para isso, deseja criar
//        um programa que analisa se o número que ela definiu previamente é par ou ímpar.
//        Como você ajudaria Ana a escrever um programa que determine
//        se um número é par ou ímpar e exiba o resultado corretamente?


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero para verificar se é par ou Impar");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero: " + numero + " é par");
        } else {
            System.out.println("O numero: " + numero + " é impar");
        }


    }
}
