package DataEHora;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {

        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela =  LocalDate.of(2026, 1, 15);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        if (dataPrimeiraParcela.isBefore(LocalDate.now())) {
            System.out.println("anterior ao dia do Vencimento ");
        } else {
            System.out.println("superior ao dia do vencimento");
        }

        System.out.println("Data Compra: " + dataCompra);
        System.out.println("Data primeira parcela: "  + dataPrimeiraParcela );
        System.out.println("Data segunda parcela " + dataSegundaParcela);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Data Compra formatada: " + dataCompra.format(formatter));

        //Mudar o fuso horario
        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        System.out.println("Data de conclusao da Compra : " + dataConclusaoCompra);

        ZonedDateTime dataCompraNY = dataConclusaoCompra.withZoneSameInstant
                (ZoneId.of("America/New_York"));
        System.out.println("Data de conclusao da Compra em NY: " + dataCompraNY);

        //Calculo de horas

        LocalTime inicio = LocalTime.of(18, 0 );
        LocalTime fim = LocalTime.of(6, 0 );

        Duration duracao = Duration.between(inicio, fim);

        System.out.println("Duração do Expediente " + duracao.toHours() +
                " horas e " + duracao.toMinutes() + " minutos.");

        LocalDate dataPagamento = LocalDate.parse("2026-01-05");
        Period period = Period.between(dataCompra , dataPagamento);

        System.out.println("Diferença em dias é: " + period.getDays());




    }

}
