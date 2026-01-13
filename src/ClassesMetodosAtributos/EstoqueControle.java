package ClassesMetodosAtributos;

public class EstoqueControle {
    
    //Você está desenvolvendo um sistema de gerenciamento para uma loja de roupas e precisa garantir que o estoque seja atualizado corretamente a cada venda realizada. Seu programa deve processar as vendas e alertar quando não houver produtos suficientes no estoque.
    //
    //Crie um programa que:
    //
    //Defina uma classe com os atributos nome e quantidade.
    //Implemente um método que:
    //Subtraia a quantidade vendida do estoque se houver disponibilidade.
    //Exiba uma mensagem formatada com o saldo atual usando printf
    //Exiba um alerta “Estoque insuficiente” quando não for possível atender a venda.

    String nome;
    int quantidade;

    public EstoqueControle(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void QuantidadeVendida(int quantidade) {
        if (quantidade > this.quantidade) {
            System.out.println("Estoque insuficiente \n");
        } else {
            this.quantidade -= quantidade;
        }
    }

    public void ExibibirSaldo () {
        System.out.printf("Nome do produto: %s \n Estoque Disponivel:  %d \n",
                nome,quantidade);
    }


    public static void main(String[] args) {

        EstoqueControle produto1 = new EstoqueControle("Camisa do Ben10", 50);

        produto1.ExibibirSaldo();
        produto1.QuantidadeVendida(25);
        produto1.ExibibirSaldo();

        EstoqueControle produto2 = new EstoqueControle("Calça", 20);
        produto2.ExibibirSaldo();
        produto2.QuantidadeVendida(30);
        produto2.ExibibirSaldo();





    }

}
