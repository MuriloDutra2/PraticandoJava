package Encapsulamento;


//Você está desenvolvendo um sistema para uma oficina mecânica registrar os veículos que chegam para manutenção. Cada carro precisa ser identificado com algumas informações para o controle interno.
//
//Crie um programa que:
//
//Defina uma classe com os atributos modelo, placa e ano.
//Defina uma instancia dessa classe através do método construtor.
//Exiba as informações do veículo no console.
public class CadastroDeVeiculos {

    private String modelo;
    private String placa;
    private int ano;

    public CadastroDeVeiculos(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public void ExibirInformacoes() {
        System.out.printf("Veiculo cadastrado: \n Modelo: %s \n Placa:  %s \n Ano: %d",
                modelo, placa, ano);
    }

    //Getters

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }
}
