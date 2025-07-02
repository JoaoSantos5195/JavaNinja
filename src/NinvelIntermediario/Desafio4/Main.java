package NinvelIntermediario.Desafio4;

public class Main {
    public static void main(String[] args) {
        NinjaBasico Konohamaru = new NinjaBasico("Konohamaru", TipoHabilidade.NINJUTSU, (short) 14);
        NinjaAvancado RockLee = new NinjaAvancado("Rock Lee", TipoHabilidade.TAIJUTSU, (short) 17, "Socos implacáveis");

        Konohamaru.mostrarInformacoes();
        Konohamaru.executarHabilidade();
        RockLee.mostrarInformacoes();
        RockLee.executarHabilidade();
        RockLee.mostrarEspecialidade();

    }
}
