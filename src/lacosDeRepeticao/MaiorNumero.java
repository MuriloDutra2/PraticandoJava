package lacosDeRepeticao;

import java.util.Scanner;

public class MaiorNumero {
    //Carlos tem uma lista de números e quer descobrir qual é o maior valor. Para isso, ele decidiu percorrer a lista comparando cada número com o maior encontrado até o momento. Crie um programa que receba uma lista de números e encontre o maior número.


    public static void main(String[] args) {




        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite os numeros separados por espaço: ");
        String[] numerosStr = leitor.nextLine().split(" "); // toda vez que tiver um espaço, o Split vai cortar
        int maior = Integer.MIN_VALUE; //menor número inteiro possível

        for( String numStr : numerosStr) {
            int num = Integer.parseInt(numStr);
            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("O maior número é: " + maior);

        leitor.close();


    }
}
