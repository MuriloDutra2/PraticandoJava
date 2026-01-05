package DataEHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {
    //Você trabalha em uma agência de turismo e é responsável pelo agendamento de eventos como passeios e excursões. Para garantir uma boa organização, o sistema precisa verificar se um evento já ocorreu ou ainda está por vir com base na data atual.
    //
    //Crie um programa que:
    //
    //Receba uma data de evento previamente cadastrada.
    //Compare essa data com a data atual.
    //Exiba a data do evento e a data atual no formato dd-MM-yyyy.
    //Informe se o evento já ocorreu ou ainda está por vir.

    public static void main(String[] args) {

        LocalDate DataDoEvento = LocalDate.of(2026, 2, 5);
        LocalDate DataAtual = LocalDate.now();

        DateTimeFormatter formatterDate =  DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("A data do evento é: " + DataDoEvento.format(formatterDate));
        System.out.println("A data atual é: " + DataAtual.format(formatterDate));

        if (DataDoEvento.isBefore(DataAtual)) {
            System.out.println("A data do evento já passou");
        } else if (DataDoEvento.isEqual(DataAtual)) {
            System.out.println("A Data do evento é hoje");
        } else {
            System.out.println("A data do evento ainda está por vir");
        }

    }

}
