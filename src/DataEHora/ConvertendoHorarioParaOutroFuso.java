package DataEHora;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertendoHorarioParaOutroFuso {
    //Você trabalha em uma empresa global e precisa agendar reuniões com colegas da Austrália. Como os horários variam de acordo com o fuso horário, você precisa de um sistema que converta automaticamente o horário local para o horário de Sydney.
    //
    //Crie um programa que converta o horário atual do sistema (fuso horário padrão) para o fuso horário de Sydney (Australia/Sydney) e exiba apenas as horas e os minutos. Dica: Utilize o método withZoneSameInstant() para realizar a conversão.

    public static void main(String[] args) {

        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss");

        ZonedDateTime HorarioAtualBrasilia = ZonedDateTime.now();
        System.out.println("Horario Atual De Brasilia: " + HorarioAtualBrasilia.format(formatterTime) );

        ZonedDateTime HorarioAtualSidney = HorarioAtualBrasilia.withZoneSameInstant
                (ZoneId.of("Australia/Sydney"));

        System.out.println("Horario Atual em Sidney " + HorarioAtualSidney.format(formatterTime));

    }

}
