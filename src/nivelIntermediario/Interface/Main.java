package nivelIntermediario.Interface;

public class Main {

    public static void main(String[] args) {
        Boruto boruto = new Boruto();
        boruto.nome = "Boruto Uzumaki";
        boruto.idade = 12;
        boruto.aldeia = "Konoha";
        boruto.habilidadeEspecial = "Karma e Jougan";
        boruto.jeitoNinja();
        boruto.ativarOKarma();
        boruto.ativarJougan();
    }
}
