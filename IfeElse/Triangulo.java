package IfeElse;

import java.util.Scanner;

public class Triangulo {
    //Marcos está estudando geometria e precisa verificar se três lados podem formar um triângulo. Para que três lados formem um triângulo, a soma de dois lados deve ser maior que o terceiro lado. Ele quer um programa que receba três lados e exiba uma mensagem informando se os lados podem formar um triângulo ou não.
    //
    //Com base nesse cenário, crie um programa que receba três lados e exiba uma mensagem informando se os lados podem formar um triângulo ou não.

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


        System.out.println("digite os 3 lados do triangulo ");
        int lado1 = leitor.nextInt();
        int lado2 = leitor.nextInt();
        int lado3 = leitor.nextInt();


        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2 ) {
            System.out.println("Os lados podem ser um triangulho");
        } else {
            System.out.println("Os lados não podem ser um triangulo");
        }
    leitor.close();

    }
}
