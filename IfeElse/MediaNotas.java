package IfeElse;

public class MediaNotas {
    public static void main(String[] args) {

//        Julia é professora e precisa de um
//        programa que ajude a determinar se um aluno foi aprovado na
//        disciplina. A regra da escola é:
//        O estudante é aprovado se média final
//        é maior ou igual a 7.0.
//                Se a média for entre 5.0 e 6.9,
//            está de recuperação.
//        Se for abaixo de 5.0, está reprovado.
//                Crie um programa que, a partir de uma variável media,
//                exiba a situação do estudante conforme as regras da escol


        double nota1 = 7;
        double nota2 = 8;
        double nota3 = 6;
        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7.0) {
            System.out.println("O estudante teve média " + media + " e foi aprovado. ");
        } else if (media >= 5.0 ) {
            System.out.println("O estudante teve média " + media + " e está de recuperação. ");
        } else {
            System.out.println("O estudante teve média"+ media +  "e foi reprovado. ");
        }


    }
}
