package ClassesMetodosAtributos;

public class ContaSaldo {

    //Imagine que você está desenvolvendo um sistema de conta digital onde os usuários podem realizar transações financeiras. Em determinadas situações, como encerramento de conta, é necessário zerar o saldo disponível.
    //
    //Crie um programa que:
    //
    //Defina uma classe com o atributo saldo.
    //Implemente um método que redefine o valor do saldo para 0.0.
    //Implemente um método que mostra o saldo atual formatado.

    double saldo;

    public ContaSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirSaldo() {
        System.out.printf("O saldo atual é R$%.2f \n",
                saldo);
    }


    public void zerarSaldo() {
        this.saldo = 0;
        System.out.printf("O saldo zerado \n");
    }





    public static void main(String[] args) {

        ContaSaldo contaSaldo = new ContaSaldo(2500);

        contaSaldo.exibirSaldo();
        contaSaldo.zerarSaldo();
        contaSaldo.exibirSaldo();

    }
}
