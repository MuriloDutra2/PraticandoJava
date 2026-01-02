package DataEHora;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataEHoraFormatado {
    //Você trabalha no setor de tecnologia de uma empresa que gera relatórios diários. Esses relatórios incluem informações como transações realizadas, atualizações de pedidos e registros de atendimento ao cliente. A equipe responsável pela análise dos relatórios solicitou que a data e a hora sejam exibidas em um formato mais familiar para os usuários brasileiros.
    //
    //Para resolver essa tarefa, você deve:
    //
    //Capturar a data e a hora atuais.
    //Formatar a data no padrão dd-MM-yyyy (dia-mês-ano).
    //Formatar a hora no padrão HH:mm (hora e minutos).
    //Exibir o resultado da formatação.

    public static void main(String[] args) {

        LocalDate dataAtual = LocalDate.now();
        LocalTime HoraAtual = LocalTime.now();

        System.out.println("Data atual sem formatação " + dataAtual);
        System.out.println("Hora atual sem formatação " + HoraAtual);

        DateTimeFormatter formatterDate =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Data atual com  formatação " + dataAtual.format(formatterDate));
        System.out.println("Hora atual com formatação " + HoraAtual.format(formatterTime));
    }
}
