package DataEHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Antecedencia {
    //Você trabalha no setor financeiro de uma empresa e precisa garantir que as contas sejam pagas antes do vencimento. Para isso, o sistema deve calcular a data exata em que um lembrete de pagamento deve ser disparado com base no prazo de antecedência definido.
    //
    //Por exemplo, se uma conta vence no dia 20 de um mês e os lembretes devem ser enviados 10 dias antes, a notificação deve ser disparada no dia 10. Já se o vencimento for 30 de março de 2025 e a antecedência for de 5 dias, o lembrete deverá ser enviado no dia 25 de março de 2025.
    //
    //Crie um programa que, a partir de uma data de vencimento e um período de antecedência em dias, calcule e exiba a data que o lembrete para pagamento deve ser disparado.


    public static void main(String[] args) {

        LocalDate DataDeVencimento = LocalDate.of(2026, 5,20);
        LocalDate DataDeAvisoDeAtencedencia = DataDeVencimento.minusDays(10);

        DateTimeFormatter formatterDate =  DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("A data de vencimento é: " + DataDeVencimento.format(formatterDate));
        System.out.println("A data do que o aviso será lançado é: " + DataDeAvisoDeAtencedencia.format(formatterDate));


    }
}
