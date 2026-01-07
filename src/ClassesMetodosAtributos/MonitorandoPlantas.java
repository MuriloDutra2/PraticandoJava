package ClassesMetodosAtributos;

public class MonitorandoPlantas {

    //Imagine que você faz parte de uma equipe de agricultura tecnológica responsável por monitorar estufas inteligentes. Cada setor possui sensores que coletam dados críticos para o crescimento das plantas. Seu desafio é desenvolver um sistema que não apenas registre a temperatura, mas também alerte quando as condições saírem do ideal, garantindo a saúde das culturas.
    //
    //Crie uma classe que:
    //
    //Possua os atributos local, indicando o setor monitorado, e temperatura atual, armazenando a última medição.
    //Implemente um método que mostre:
    //O local do sensor.
    //A temperatura formatada com uma casa decimal.
    //Um alerta se a temperatura ultrapassar 37.5ºC.

    String local;
    double temperatura;

    public MonitorandoPlantas(String local, double temperatura) {
        this.local = local;
        this.temperatura = temperatura;
    }

    public void ExibirInformacoes() {
        System.out.printf("Local: %s, Temperatura: %.1fºC \n",
                local, temperatura);
    }


    public void VerificarTemperatura() {
        if (temperatura > 37.5) {
            System.out.println("Alerta: Temperatura acima do limite!");
        } else {
            System.out.println("Temperatura estável");
        }
    }

    public static void main(String[] args) {

        MonitorandoPlantas monitorandoPlantas = new MonitorandoPlantas("Setor M", 39.2 );
        MonitorandoPlantas monitorandoPlantas2 = new MonitorandoPlantas("Setor Z", 36.2 );

        monitorandoPlantas.ExibirInformacoes();
        monitorandoPlantas.VerificarTemperatura();

        monitorandoPlantas2.ExibirInformacoes();
        monitorandoPlantas2.VerificarTemperatura();


    }



}
