package nivelIntermediario.construtores;

public class Main {
    public static void main(String[] args) {
        Hokage hashirama = new Hokage();
        hashirama.nome = "Hashirama Senju";
        hashirama.vivoOuMorto = false;
        System.out.println("O ninja " + hashirama.nome + " está " + (hashirama.vivoOuMorto ? "vivo" : "morto") + ".");

        Hokage minato = new Hokage("Minato Namikaze", 35, false);
        System.out.println("O ninja " + minato.nome + " tem " + minato.idade + " anos e está " + (minato.vivoOuMorto ? "vivo" : "morto") + ".");

    }
}
