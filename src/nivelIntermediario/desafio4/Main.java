package nivelIntermediario.desafio4;

public class Main {
    public static void main(String[] args) {
        // Criando um ninja básico
        NinjaBasico ninja1 = new NinjaBasico("Hattori", 25, TipoHabilidade.NINJUTSU);
        ninja1.mostrarInformacoes();
        ninja1.executarHabilidade();

        System.out.println();
        // Criando um ninja avançado
        NinjaAvancado ninja2 = new NinjaAvancado("Kenshin", 30, TipoHabilidade.TAIJUTSU, "Kenjutsu");
        ninja2.mostrarInformacoes();
        ninja2.executarHabilidade();
    }
}
