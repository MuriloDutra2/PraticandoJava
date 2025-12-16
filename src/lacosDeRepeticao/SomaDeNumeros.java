package lacosDeRepeticao;

public class SomaDeNumeros {

    //João recebeu uma lista de valores representando as receitas de sua loja de roupas. Ele quer calcular a soma total dessas receitas para entender o desempenho financeiro semanal.

    public static void main(String[] args) {

        int[] valores = {10, 20, 30, 40, 50};

        int valorTotal = 0;

        for (int i = 0; i < valores.length; i++) {
        valorTotal = valorTotal + valores[i];
        }

        System.out.println("A soma total das receitas é: " + valorTotal);
    }
}
