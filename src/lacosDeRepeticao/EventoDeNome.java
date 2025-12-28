package lacosDeRepeticao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EventoDeNome {
    //Maria está preparando um evento de aniversário e quer organizar a lista de convidados. Ela precisa de um sistema que:
    //
    //Exiba a lista de convidados já cadastrados caso o usuário digite "ver".
    //Adicione novos nomes à lista, caso o nome não esteja lá.
    //Caso o nome já esteja na lista, o programa deve informar que o nome já foi registrado.
    //O programa deve permitir que Maria continue a adicionar nomes até ela digitar "sair".
    //Ajude Maria e faça o código para este sistema.
    //
    //Saída esperada:

    public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

        List<String> listaDeNomes = new ArrayList<>();

     while (true) {
         System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): Ana\n");
         String decisao = leitor.next();

         if (decisao.equalsIgnoreCase("ver")){
             System.out.println(listaDeNomes);
         } else if (decisao.equalsIgnoreCase("sair")) {
             System.out.println("Programa Finalizado");
             break;
         } else {
             System.out.println("Nome add com sucesso");
             listaDeNomes.add(decisao);
         }


     }









    leitor.close();

    }
}
