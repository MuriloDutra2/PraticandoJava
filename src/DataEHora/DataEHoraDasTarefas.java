package DataEHora;

import java.time.LocalDate;
import java.time.LocalTime;
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

        String tarefa =  " Enviar relatório semanal ";

        LocalDate dataAtual = LocalDate.now();
        LocalTime HoraAtual = LocalTime.now();



        System.out.println("A tarefa1 : "  + tarefa + "Foi criada no dia " + dataAtual +  " Na hora: " + HoraAtual);


    }

}
