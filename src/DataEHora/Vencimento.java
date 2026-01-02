package DataEHora;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Vencimento {
    public static void main(String[] args) {
        //Você trabalha no setor financeiro de uma empresa de serviços e é responsável por gerenciar o vencimento das faturas dos clientes. Em alguns casos, os clientes solicitam um adiamento da data de pagamento, e o sistema precisa calcular a nova data de vencimento com base na quantidade de meses adicionados.
        //
        //Crie um programa que:
        //
        //Receba uma data de vencimento original.
        //Adicione um número de meses ao vencimento.
        //A data ajustada deve ser exibida no formato dd-MM-yyyy.


        LocalDate dataDoVencimentoOriginal = LocalDate.of(2026, 1, 5);
        LocalDate mesesAdd = dataDoVencimentoOriginal.plusMonths(5);

        DateTimeFormatter formatterDate =  DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data Original do Vencimento: " + dataDoVencimentoOriginal.format(formatterDate));

        System.out.println("Data nova do Vencimento: " + mesesAdd.format(formatterDate));




    }
}
