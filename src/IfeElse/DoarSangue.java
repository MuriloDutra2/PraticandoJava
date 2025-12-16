package IfeElse;

import java.util.Scanner;

public class DoarSangue {
    //Maria trabalha em um banco de sangue e precisa verificar se um doador é compatível para doar sangue. Para ser compatível, o doador deve atender aos seguintes critérios:
    //
    //Ter entre 18 e 65 anos.
    //
    //Pesar mais de 50 kg.
    //
    //Ela deseja um programa que receba a idade e o peso do doador e informe se ele é compatível para doar sangue. Se não for, o programa deve indicar qual critério não foi atendido.
    //
    //Como você criaria um programa que receba a idade e o peso do doador e exiba uma mensagem indicando se ele é compatível ou não, além de informar o critério não atendido, se for o caso?

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o peso do doador (em kg): ");
        double peso = leitor.nextDouble();

        System.out.println("Digite a idade do Doador: ");
        int idade = leitor.nextInt();

        boolean  idadeValida = idade >= 18 && idade <= 65;
        boolean pesoValido = peso > 50;


        if (idadeValida && pesoValido ) {
            System.out.println("Usuário compátivel");
        } else if (!pesoValido) {
            System.out.println("Usuário imcompátivel " +
                    "Motivo: peso tem que ser maior que 50");
        } else if (!idadeValida) {
            System.out.println("Usuário imcompátivel " +
                    "Motivo:- Deve ter entre 18 e 65 anos.");
        }

        leitor.close();
    }
}
