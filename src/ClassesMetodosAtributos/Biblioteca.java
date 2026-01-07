package ClassesMetodosAtributos;

public class Biblioteca {

    //Imagine que você está criando um sistema de catalogação para uma biblioteca. Seu objetivo é desenvolver uma estrutura que armazene dados de obras literárias e as exiba em um formato padronizado, facilitando a consulta por outros leitores.
    //
    //Crie um programa que:
    //
    //Defina uma classe com os atributos título, autor e páginas.
    //Implemente um método que use printf para mostrar os dados no formato: "[TÍTULO]" de [AUTOR] com [PÁGINAS] páginas.


    String titulo;
    String autor;
    int paginas;

    public void ExibirInformacoes() {
        System.out.printf("\"%s\" de %s com %d paginas",
                titulo, autor, paginas);
    }

    public Biblioteca(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public static void main(String[] args) {
        Biblioteca l = new Biblioteca("O Ego é seu Inimigo", "Ryan Holiday", 250);

        l.ExibirInformacoes();


    }


}
