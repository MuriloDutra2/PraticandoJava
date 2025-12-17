package lacosDeRepeticao;

import java.util.Scanner;

public class ContagemDeLogin {

    //Leonardo trabalha no setor de segurança de um sistema bancário e precisa garantir que os usuários tenham um número limitado de tentativas para inserir a senha corretamente. Se o usuário errar a senha 3 vezes seguidas, sua conta deve ser bloqueada temporariamente.
    //
    //Com base nesse cenário, crie um programa que peça uma senha ao usuário e permita até 3 tentativas de erro antes de bloquear o acesso. Se o usuário digitar corretamente antes disso, o sistema deve conceder o acesso imediatamente.

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int senha = 1234;
        int contador = 0;



        System.out.println("Digite a senha: ");
        int senhaDigitada = leitor.nextInt();

    if (senhaDigitada != senha) {
        while (contador != 3) {


            System.out.println(senhaDigitada );


            contador++;


        }

    }




    }
}
