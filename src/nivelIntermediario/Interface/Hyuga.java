package nivelIntermediario.Interface;

public class Hyuga extends Ninja {
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println("Sou do clã Hyuga e minha habilidade especial é " + habilidadeEspecial + ".");
    }

    public void ativarByakugan() {
        System.out.println("Ativando Byakugan...");
    }

    @Override
    public void jeitoNinja() {
        super.jeitoNinja();
        mostrarHabilidadeEspecial();
    }
}
