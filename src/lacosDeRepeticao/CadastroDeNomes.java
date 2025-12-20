package lacosDeRepeticao;

import java.util.Scanner;

public class CadastroDeNomes {
    //Um sistema de cadastro exige que os usuários informem um nome válido
    // No entanto, alguns usuários tentam deixar o campo em branco ou inserir nomes muito curtos. O sistema precisa garantir que o nome tenha pelo menos 3 caracteres antes de prosseguir com o cadastro.
    //
    //Com base nesse cenário, crie um programa que
    // continue pedindo um nome até que o usuário insira um valor válido com pelo menos 3 caracteres.

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String nomeUsuario = leitor.nextLine();

        if (nomeUsuario.length() >= 3) {
            System.out.println("Nome de usuario Cadastrado com sucesso");
        } else {
            while (nomeUsuario.length() < 3) {
                System.out.println("Nome inválido. Digite novamente.");
                nomeUsuario = leitor.nextLine();
            }
        }
        System.out.println("Nome "+ nomeUsuario +" cadastrado com sucesso!");


        leitor.close();

        //Codigo correto:



                Scanner scanner = new Scanner(System.in);
                String nome;
                do {
                    System.out.print("Digite seu nome: ");
                    nome = scanner.nextLine();
                    if (nome.length() < 3) {
                        System.out.println("Nome inválido. Digite novamente.");
                    }
                } while (nome.length() < 3);
                System.out.println("Nome \"" + nome + "\" cadastrado com sucesso!");
                scanner.close();


    }

}
