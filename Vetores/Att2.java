package Vetores;

import java.util.Scanner;

public class Att2 {
    public static void main(String[] args) {
//        2. Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos.

        Scanner sc = new Scanner(System.in);

        int [] vetor = new int[6];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor da posição " + i + " Do vetor: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Valores do vetor");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

    }
}
