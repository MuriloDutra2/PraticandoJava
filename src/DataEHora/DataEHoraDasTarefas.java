package DataEHora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataEHoraDasTarefas {
    //Você está desenvolvendo um sistema de log para um aplicativo de gerenciamento de tarefas. Sempre que uma nova tarefa é criada, o sistema deve registrar a data e a hora exatas do momento da criação.
    //
    //Para isso, implemente um programa que:
    //
    //Simule a criação de uma tarefa através de uma variável simples, por exemplo String tarefa = "Enviar relatório semanal";.
    //Registre a data e a hora exatas da criação.
    //Exiba essas informações no formato adequado.

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);



        System.out.println("Voce quer criar uma tarefa? S / N (N finaliza o programa)");
        String decisao = leitor.next();













        leitor.close();
    }

}
