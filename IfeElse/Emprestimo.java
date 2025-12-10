package IfeElse;

import java.util.Scanner;

public class Emprestimo {

    //Emerson trabalha em um banco e precisa verificar se um número digitado pelo cliente está dentro da faixa permitida de valores para um empréstimo, que vai de 1000 a 5000 reais.
    //
    //Crie um programa que receba um valor e exiba se ele está dentro do intervalo permitido ou não.

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do emprestimo desejado: ");
        double valor = leitor.nextDouble();

        if (valor >= 1000 && valor <= 5000) {
            System.out.println("O valor " + valor + " está dentro do intervalo permitido para empréstimo.");
        } else {
            System.out.println("O valor " + valor + " não está dentro do intervalo permitido para empréstimo.");
        }
        leitor.close();

    }
}
