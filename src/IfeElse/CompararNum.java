package IfeElse;

import java.util.Scanner;

public class CompararNum {
    public static void main(String[] args) {


//        Pedro está aprendendo Java e se deparou com um problema:
////        ele precisa criar um programa que compare dois números inteiros fornecidos pelo
////        usuário e informe qual é o maior ou se são iguais. Mas, ele está com dificuldades
////        para implementar a lógica de comparação e exibir o resultado corretamente.
////        Ajude Pedro a resolver esse problema! Crie um programa que
////        solicite ao usuário dois números inteiros,
////                compare-os e exiba uma mensagem indicando qual é o maior ou se ambos são iguais.


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero 1 : ");
        int n1 = sc.nextInt();

        System.out.println("Digite o numero 2: ");
        int n2 = sc.nextInt();

        if (n1 == n2) {
            System.out.println("numeros iguais");
        }else if (n1 > n2 ) {
            System.out.println(" o numero " + n1 + " é Maior que o numero " + n2);
        } else {
            System.out.println(" o numero " + n2 + " é Maior que o numero " + n1);
        }
    sc.close();

    }
}
