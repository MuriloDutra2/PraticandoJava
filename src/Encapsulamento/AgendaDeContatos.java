package Encapsulamento;


//Você está desenvolvendo um aplicativo de agenda para uma empresa. Os funcionários precisam acessar rapidamente os contatos de clientes e fornecedores, mantendo as informações organizadas e fáceis de localizar.
//
//Crie uma classe que:
//
//Armazene contatos com nome e telefone em uma lista
//Permita visualizar todos os contatos cadastrados
//Formate a exibição para melhor legibilidade
public class AgendaDeContatos {

    private String nome, numero;


    public AgendaDeContatos(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }
}
