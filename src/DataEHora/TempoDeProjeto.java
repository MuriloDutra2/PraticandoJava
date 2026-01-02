package DataEHora;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TempoDeProjeto {
    //Você é responsável pelo controle de tempo em projetos dentro de uma agência de desenvolvimento. Você precisa monitorar o tempo gasto em cada tarefa para garantir que os projetos sejam executados dentro do prazo.
    //
    //Para isso, crie um programa que:
    //
    //Receba dois horários representando o início e o término de uma atividade.
    //Calcule a diferença em horas e minutos entre esses dois horários.
    //Exiba o resultado formatado.

    public static void main(String[] args) {

        LocalTime inicio = LocalTime.of(14, 0);
        LocalTime termino = LocalTime.of(20, 0 );

        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Horário de Início: " + inicio.format(formatterTime));
        System.out.println("Horário de Fim: " + termino.format(formatterTime));



        Duration duracao = Duration.between(inicio, termino);

        long horasTotais = duracao.toHours();
        long minutosTotais = duracao.toMinutesPart() ;


        System.out.println("Diferença de tempo: " + horasTotais + " horas e " + minutosTotais + " minutos");





    }
}
