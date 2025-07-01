package nivelIntermediario.Interface;

public class Uzumaki extends Ninja {
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println("Eu sou um Uzumaki e minha habilidade especial é " + habilidadeEspecial + ".");
    }

    public void ativarKurama() {
        System.out.println("Ativando Kurama...");
    }

    @Override
    public void jeitoNinja() {
        super.jeitoNinja();
        mostrarHabilidadeEspecial();
    }
}

