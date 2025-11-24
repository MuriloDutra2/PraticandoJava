package Variaveis;

public class CelsiusParaFahrenheit  {
    public static void main(String[] args) {

        /*
        *
  Você está desenvolvendo um sistema de monitoramento de temperatura
 para uma estufa de plantas. Você recebe os dados de temperatura em graus Celsius, mas precisa exibi-los
em Fahrenheit para um relatório que será enviado para um cliente nos Estados Unidos.
         * */

    int celsius = 20;
    double Fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura em graus Fahrenheit é: " + Fahrenheit);


    }
}
