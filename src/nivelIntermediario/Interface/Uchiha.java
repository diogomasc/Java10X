package nivelIntermediario.Interface;

public class Uchiha extends Ninja {
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println("Sou clã Uchiha e minha habilidade especial é " + habilidadeEspecial + ".");
    }

    public void ativarSharingan() {
        System.out.println("Ativando Sharingan...");
    }

    @Override
    public void jeitoNinja() {
        super.jeitoNinja();
        mostrarHabilidadeEspecial();
    }
}
