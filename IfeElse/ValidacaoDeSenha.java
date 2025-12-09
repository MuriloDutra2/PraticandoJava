package IfeElse;

import java.util.Scanner;

public class ValidacaoDeSenha {
    public static void main(String[] args) {

//        Jéssica trabalha no setor de TI de uma empresa e precisa
//        garantir a segurança dos acessos ao sistema interno.
//        Os funcionários utilizam uma senha fixa para acessar suas contas
//        e o sistema deve verificar se a senha inserida está correta.
//        Ajude Jéssica a criar um programa que, com base em uma senha pré-definida,
//                por exemplo: 123456, verifique se o que o usuário digitou está correto
//        ou não. O programa deve comparar a tentativa com a senha correta e exibir se o
//        acesso foi permitido ou negado.

        Scanner sc = new Scanner(System.in);


        String senhaCorreta = "murilo123456";
        System.out.println("insira a senha Correta: ");
        String senhaInserida = sc.nextLine();

        if (senhaCorreta.equals(senhaInserida)) {
            System.out.println("Senha Correta, acesso Liberado");
        } else {
            System.out.println("Senha Incorreta");
        }


    }
}
