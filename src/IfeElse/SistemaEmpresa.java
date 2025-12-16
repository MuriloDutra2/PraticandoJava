package IfeElse;

import java.util.Scanner;

public class SistemaEmpresa {

    //João está desenvolvendo um sistema de segurança para uma empresa. Para acessar o sistema, o usuário precisa fornecer:
    //
    //Um código de acesso numérico (o código correto é 2025).
    //
    //Um nível de permissão numérico (os níveis válidos são 1, 2 ou 3).
    //
    //O sistema só permitirá o acesso se:
    //
    //O código de acesso estiver correto.
    //
    //O nível de permissão for válido (1, 2 ou 3).
    //
    //Caso contrário, o acesso será negado, e o programa deve informar o motivo (código incorreto, nível de permissão inválido ou ambos).
    //
    //Crie um programa que receba o código de acesso e o nível de permissão e exiba uma mensagem indicando se o acesso foi permitido ou negado, além do motivo, se for o caso.

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o codigo numerico: ");
        int codigo = leitor.nextInt();

        System.out.println("Digite o nivel de permissão: ");
        int nivel = leitor.nextInt();

        int codigoCorreto = 2025;

        boolean codigoValido = codigo == codigoCorreto;
        int nivelPermissaoMinimo = 1;
        int nivelPermissaoMaximo = 3;

        boolean permissaoValida = nivel >= nivelPermissaoMinimo && nivel <= nivelPermissaoMaximo;


        if (codigoValido && permissaoValida) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema! ");
        } else {
            System.out.println("Acesso negado, Motivos: ");
            if (!codigoValido) {
                System.out.println("Codigo incorreto");
            }
            if (!permissaoValida) {
                System.out.println("Nivel Incorreto");
            }
        }
    leitor.close();

    }
}
