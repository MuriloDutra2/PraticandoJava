package Vetores;

import java.util.Scanner;

public class Att3 {
    public static void main(String[] args) {

        //3. Ler um conjunto de numeros reais, armazenando-o em vetor e calcular o quadrado das ´
        //componentes deste vetor, armazenando o resultado em outro vetor. Os conjuntos temˆ
        //10 elementos cada. Imprimir todos os conjuntos.

        Scanner sc = new Scanner(System.in);

        double [] vetorReais = new double [10];

        double [] quadradoDoVetores = new double[10];

        for (int i = 0; i < vetorReais.length; i++) {
            System.out.println("Digite o valor dos vetores: ");
            vetorReais[i] = sc.nextDouble();
            quadradoDoVetores[i] = vetorReais[i] * vetorReais[i];
        }
        System.out.println("valores do vetor: ");
        for (int i = 0; i < vetorReais.length; i++) {
            System.out.println(vetorReais[i]);

        }

        System.out.println("Quadrado dos valores do vetor: ");
        for (int i = 0; i < quadradoDoVetores.length; i++) {
            System.out.println(quadradoDoVetores[i]);

        }




    }
}
