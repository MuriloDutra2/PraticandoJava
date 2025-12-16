package lacosDeRepeticao;

import java.util.Scanner;

public class Escadaria {

    //Carla começou a praticar trilha e deseja saber quantos degraus precisará subir para chegar ao topo de uma escadaria. Ela sobe um degrau por vez e quer um programa que mostre sua subida até o topo. Sua tarefa é criar um programa que receba um número e simule a subida da escadaria.


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o numero de degraus: ");
        int numeroDeDegraus = leitor.nextInt();


        for (int i = 1; i <= numeroDeDegraus; i++) {

            System.out.println("Subindo o degrau " + i);


        }
        System.out.println("Você chegou no topo! ");
        leitor.close();



    }

}
