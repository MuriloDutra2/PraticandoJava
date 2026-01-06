package ClassesMetodosAtributos;

public class RelatorioDeProdutos {
    //Imagine que você é responsável pelo controle de estoque de uma loja de informática que está expandindo seus negócios. Com o aumento da demanda, é importante manter um registro organizado e preciso de todos os produtos disponíveis. Sua tarefa é criar um sistema que armazene as informações de cada item e gere um relatório para facilitar a gestão do estoque.
    //
    //Sua tarefa é criar uma classe que:
    //
    //Represente um produto com os atributos nome, preço e quantidade.
    //Implemente um método que mostre os dados formatados, garantindo que o preço seja exibido com duas casas decimais.


    String nome;
    double preco;
    int quantidade;

    public void ExibirInformacoes() {
        System.out.printf("Produto =  %s \n Preco = %.2f \n quantidade = %d",
                nome,preco,quantidade);
    }


    public static void main(String[] args) {

        RelatorioDeProdutos Produto1 = new  RelatorioDeProdutos();

        Produto1.nome = "Mouse Gamer";
        Produto1.preco = 150;
        Produto1.quantidade = 50;

        Produto1.ExibirInformacoes();
    }

}
