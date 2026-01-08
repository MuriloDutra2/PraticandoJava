package ClassesMetodosAtributos;

import java.util.ArrayList;
import java.util.List;

public class Tarefa {

    //Você está desenvolvendo um sistema de gerenciamento de tarefas pessoais para ajudar usuários a organizar suas atividades diárias. Cada tarefa precisa ser registrada com uma descrição e um status que indique se já foi concluída ou não. Seu objetivo é criar uma estrutura que armazene essas tarefas e permita visualizá-las.
    //
    //Crie um programa que:
    //
    //Defina uma classe com os atributos descrição e concluída.
    //Implemente um método que mostre a descrição da tarefa e seu status.
    //Crie uma lista de tarefas e exiba todas as tarefas cadastradas. Dica: use ArrayList.

    String descricao;
    boolean situacao;

    public Tarefa(String descricao, boolean situacao) {
        this.descricao = descricao;
        this.situacao = situacao;
    }

    public void exibirDescricao() {
        String sinal;
        if (situacao) {
            sinal = "Concluida";
        } else {
            sinal = "pendente";
        }

        System.out.printf(descricao + " - " + sinal + "\n");
    }

    public static void main(String[] args) {

        ArrayList<Tarefa> ListaDeTarefas = new ArrayList<>();

        Tarefa t1 = new Tarefa("Estudar Java", false);
        ListaDeTarefas.add(t1);
        Tarefa t2 = new Tarefa("Estudar o mercado Digital", true);
        ListaDeTarefas.add(t2);

        for (Tarefa t : ListaDeTarefas) {
            t.exibirDescricao();
        }




    }

}
