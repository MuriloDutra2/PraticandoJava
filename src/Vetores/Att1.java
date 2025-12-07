package Vetores;

public class Att1 {
    public static void main(String[] args) {

//        Façaa um programa que possua um vetor denominado A que armazene 6 numeros intei- ´
//        ros. O programa deve executar os seguintes passos:
//        (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
//        (b) Armazene em uma variavel inteira (simples) a soma entre os valores das posic¸ ´ oes ˜
//        A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
//        (c) Modifique o vetor na posic¸ao 4, atribuindo a esta posic¸ ˜ ao o valor 100. ˜
//        (d) Mostre na tela cada valor do vetor A, um em cada linha.

//A
        int [] A = {1, 0, 5,-2,-5,7};

        //B
        int soma015 = A[0] + A[1] + A[1];

        System.out.println("está é a soma do valores 0 1 e 5" + soma015);

        //C
        A[4] = 100;

        //d
        System.out.println("Valores de A = " );
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }





    }
}
