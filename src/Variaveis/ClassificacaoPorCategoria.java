package Variaveis;

public class ClassificacaoPorCategoria {
    public static void main(String[] args) {

        double preco = 250;

        if (preco <= 50) {
            System.out.println("Categoria do Produto: Econômico" );
        } else if (preco == 51 || preco <=200) {
            System.out.println("Categoria do Produto: Intermediario" );
        } else if (preco > 200) {
            System.out.println("Categoria do Produto: Premium" );
        }

    }
}
