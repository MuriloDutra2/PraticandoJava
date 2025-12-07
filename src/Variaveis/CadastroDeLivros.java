package Variaveis;

public class CadastroDeLivros {
    public static void main(String[] args) {

        String titulo = "O Algebrista";
        String autor = "Murilo Dutra";
        int numeroDePaginas = 100;
        double precoDoLivro = 39.99;
        char categoria = 'H';

        if (categoria == 'F') {
            System.out.println("Livro cadastrado: " + titulo + ", de " + autor + ". Ele possui "  + numeroDePaginas +  "páginas,  custa R$" + precoDoLivro + " e pertence à categoria  Ficção");
        } else if (categoria == 'N') {
            System.out.println("Livro cadastrado: " + titulo + ", de " + autor + ". Ele possui "  + numeroDePaginas +  "páginas,  custa R$" + precoDoLivro + " e pertence à categoria  Não Ficção");
        } else if ( categoria == 'T') {
            System.out.println("Livro cadastrado: " + titulo + ", de " + autor + ". Ele possui "  + numeroDePaginas +  "páginas,  custa R$" + precoDoLivro + " e pertence à categoria  Tecnologia");
        } else if (categoria == 'H') {
            System.out.println("Livro cadastrado: " + titulo + ", de " + autor + ". Ele possui "  + numeroDePaginas +  "páginas,  custa R$" + precoDoLivro + " e pertence à categoria  Historia");
        }

    }
}
