public class Main {

    public static void main(String[] args) {

        String[] equipos = {
                "Madrid",
                "Barca",
                "Bayern",
                "PSG",
                "City",
                "Chelsea",
                "Inter",
                "Milan"
        };

        Torneo torneo = new Torneo(equipos);

        torneo.recorrerYSimular(torneo.raiz);

        System.out.println("BRACKET DEL TORNEO\n");

        torneo.mostrarBracket(torneo.raiz, "");

        System.out.println("\nCAMPEON DEL TORNEO:");
        System.out.println(torneo.campeon());
    }
}