package ClassesMetodosAtributos;

public class NotasDosAlunos {
    //Imagine que você está desenvolvendo um sistema acadêmico simplificado para auxiliar professores no acompanhamento de alunos. Seu desafio é criar uma solução que automatize o cálculo de médias e forneça rapidamente o resultado, eliminando a necessidade de cálculos manuais e reduzindo erros.
    //
    //Crie uma classe que:
    //
    //Represente os alunos com os atributos nome, nota 1´ e nota 2`.
    //Implemente um método que:
    //Calcule a média das notas.
    //Exiba o nome do aluno, suas notas e a média (com uma casa decimal).
    //Indique se o aluno foi aprovado (média >= 7) ou reprovado.

    String nome;
    double n1;
    double n2;


    public NotasDosAlunos(String nome, double n1, double n2) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
    }

    public double calcularMedia() {
        return (this.n1 + this.n2) / 2;
    }

    public boolean verificarAprovacao() {
        return calcularMedia() >= 7;
    }
    public void exibirRelatorio() {
        double mediaFinal = calcularMedia(); // Calcula com os valores reais

        System.out.printf("Nome: %s %n Nota1: %.1f %n Nota2: %.1f %n Media: %.1f %n",
                nome, n1, n2, mediaFinal);

        if (verificarAprovacao()) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
        System.out.println("--------------------");
    }

    public static void main(String[] args) {

        NotasDosAlunos aluno1 = new NotasDosAlunos("Murilo", 1, 10);

        NotasDosAlunos aluno2 = new NotasDosAlunos("Ronaldo", 7, 7);


        aluno1.exibirRelatorio();

        aluno2.exibirRelatorio();

    }




}
