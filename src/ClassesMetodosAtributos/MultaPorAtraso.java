package ClassesMetodosAtributos;

public class MultaPorAtraso {


    //Imagine que você está desenvolvendo um sistema de controle de devoluções para uma livraria. Quando um livro é devolvido com atraso, é necessário calcular o valor da multa conforme os dias de atraso.
    //
    //Crie um programa que:
    //
    //Defina uma classe com os atributos título e dias de atraso.
    //Implemente um método que:
    //Cobre R$ 2,50 por dia de atraso.
    //Retorne o valor total da multa.
    //Implemente um método que mostre o título e o valor da multa formatado.

    String titulo;
    int diasDeAtraso;

    double multaTotal;


    public void CalcularMultaTotalETitulo() {
        multaTotal = diasDeAtraso * 2.50;

    }

    public void ExibirInformacoes() {
        System.out.printf("Titulo: %s \n DiasDeAtraso: %d \n Multa a ser paga: %.2f",
                titulo, diasDeAtraso,multaTotal);
    }

    public MultaPorAtraso(String titulo, int diasDeAtraso) {
        this.titulo = titulo;
        this.diasDeAtraso = diasDeAtraso;
    }

    public static void main(String[] args) {

        MultaPorAtraso multaPorAtraso = new MultaPorAtraso("Senhor dos aneis", 15);

        multaPorAtraso.CalcularMultaTotalETitulo();
        multaPorAtraso.ExibirInformacoes();


    }
}
