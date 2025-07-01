package nivelIntermediario.desafio4;

public class NinjaAvancado extends NinjaBasico implements Ninja{
    String especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " está executando sua habilidade avançada de especialidade " + especialidade + ".");
    }
}
