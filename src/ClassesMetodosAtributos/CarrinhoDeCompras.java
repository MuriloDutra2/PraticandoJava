package ClassesMetodosAtributos;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    //Você está desenvolvendo o sistema de checkout de um e-commerce de produtos eletrônicos. Seu desafio é calcular o valor total do carrinho de compras, considerando que cada produto pode ter quantidades diferentes e preços variados.
    //
    //Crie um programa que:
    //
    //Defina uma classe com os atributos nome, preço e quantidade.
    //Implemente um método que retorne o valor total do item (preço x quantidade).
    //Crie uma lista de item e calcule o valor total da compra.

    String nome;
    double preco;
    int quantidade;

    double valorTotal;

    double calcularValorItem() {
        return preco * quantidade;
    }

    public CarrinhoDeCompras(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public static void main(String[] args) {

        CarrinhoDeCompras prod1 = new CarrinhoDeCompras("Teclado", 50.00, 3);

        CarrinhoDeCompras prod2 = new CarrinhoDeCompras("Headset", 150.00, 1);

        ArrayList<CarrinhoDeCompras> Carrinho = new ArrayList<>();

        Carrinho.add(prod1);
        Carrinho.add(prod2);

        double somaFechamento = 0;

        for ( CarrinhoDeCompras c : Carrinho) {
            double valorDoItem = c.calcularValorItem();

            somaFechamento += valorDoItem;
            System.out.println(c.nome + ": " + valorDoItem);

        }

        System.out.println("Total da compra: R$ " + somaFechamento);


    }
}
