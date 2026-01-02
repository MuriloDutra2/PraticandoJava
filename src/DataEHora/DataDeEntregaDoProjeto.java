package DataEHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataDeEntregaDoProjeto {
    //Você é responsável pelos projetos em uma empresa de desenvolvimento de software. Para garantir que os prazos sejam cumpridos, você precisa calcular a data de entrega de cada projeto com base na data de início e no prazo estimado em dias.
    //
    //Você precisa criar um programa que:
    //
    //Receba uma data de início.
    //Adicione o prazo em dias ao início do projeto.
    //Exiba a data final formatada corretamente.

    public static void main(String[] args) {

        LocalDate dataDeInicio = LocalDate.of(2026, 1, 2);
        LocalDate prazoDeConclusao = dataDeInicio.plusDays(30);

        DateTimeFormatter formatterDate =  DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("A data de inicio do projeto é dia: " + dataDeInicio.format(formatterDate));
        System.out.println("A data de entrega do projeto é dia: " + prazoDeConclusao.format(formatterDate));





    }
}
