package nivelIntermediario.Interface;

public class Ninja {
    int id;
    String nome;
    int idade;
    String aldeia;
    String missao;
    String nivelDaMissao;
    boolean statusDaMissao;

    public void mostraDados() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nível da Missão: " + nivelDaMissao);
        System.out.println("Status da Missão: " + (statusDaMissao ? "Completa" : "Pendente"));
    }

    public void jeitoNinja() {
        System.out.println("Eu sou " + nome +
                " da vila " + aldeia +
                " e tenho " + idade + " anos.");
    }

    public void mostraMissao() {
        System.out.println("Eu sou " + nome +
                " e minha missão é " + missao +
                ". Atualmente, o status da missão é " + (statusDaMissao ? "Completa" : "Pendente") +
                ". Ela é de nível " + nivelDaMissao + ".");
    }
}
