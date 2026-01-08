package ClassesMetodosAtributos;

public class CorrigindoCadastro {
    //Você está desenvolvendo um sistema de controle de colaboradores para uma empresa de tecnologia. Às vezes, é necessário atualizar o cargo e o nível de acesso de um funcionário devido a promoções ou mudanças de departamento. Seu programa deve permitir essas alterações e mostrar as informações atualizadas.
    //
    //Crie uma classe que:
    //
    //Represente um colaborador com os atributos nome, cargo e nivel de acesso.
    //Implemente um método que permita alterar o cargo e o nível de acesso.
    //Exiba no console as informações antes e depois da atualização.


    String nome;
    String cargo;
    int nivelDeAcesso;

    public CorrigindoCadastro(String nome, String cargo, int nivelDeAcesso) {
        this.nome = nome;
        this.cargo = cargo;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public void ExibirInformacoes() {
        System.out.printf("Colaborador: %s \n Cargo: %s \n Nivel de Acesso: %d \n",
                nome, cargo, nivelDeAcesso);
    }

    public void AtualizarCargo(String cargo, int nivelDeAcesso) {
        this.cargo = cargo;
        this.nivelDeAcesso = nivelDeAcesso;
        System.out.println("O novo cargo é: " + cargo);
        System.out.println("Novo Nivel de acesso é: " + nivelDeAcesso );

    }


    public static void main(String[] args) {

        CorrigindoCadastro colaborador1 = new CorrigindoCadastro("Murilo", "Desenvolvedor", 3);

        colaborador1.ExibirInformacoes();

        colaborador1.AtualizarCargo("Faxineiro", 1);

        colaborador1.ExibirInformacoes();


    }

}
