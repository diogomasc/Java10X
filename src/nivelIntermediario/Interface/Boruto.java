package nivelIntermediario.Interface;

public class Boruto extends Uzumaki implements HyugaUzumaki {
String habilidadeEspecial;

public void mostrarHabilidadeEspecial() {
    System.out.println("Eu sou Boruto e minha habilidade especial é " + habilidadeEspecial + ".");
}

public void ativarOKarma() {
    System.out.println("Ativando Karma...");
}

public void ativarJougan() {
    System.out.println("Ativando Jougan...");
}

@Override
public void jeitoNinja() {
    super.jeitoNinja();
    mostrarHabilidadeEspecial();
}
}
