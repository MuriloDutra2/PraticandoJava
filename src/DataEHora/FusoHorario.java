package DataEHora;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FusoHorario {
    //Você trabalha em uma empresa de viagens internacionais e precisa de um sistema que exiba o horário atual em diferentes países. Como a empresa tem clientes no Japão, o sistema deve ser capaz de mostrar o horário atual na cidade de Tóquio, independente do fuso horário do computador onde o programa está rodando.
    //
    //Crie um programa que exiba o horário atual no fuso horário de Tóquio (Asia/Tokyo). Utilize a classe ZonedDateTime para realizar a tarefa. Lembre-se de formatar a saída para exibir apenas horas, minutos e segundos.

    public static void main(String[] args) {

        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss");

        ZonedDateTime HorarioAtualBrasilia = ZonedDateTime.now();
        System.out.println("Horario Atual De Brasilia: " + HorarioAtualBrasilia.format(formatterTime) );

        ZonedDateTime HorarioAtualToquio = HorarioAtualBrasilia.withZoneSameInstant
                (ZoneId.of("Asia/Tokyo"));

        System.out.println("Horario Atual em Toquio " + HorarioAtualToquio.format(formatterTime));

    }
}
