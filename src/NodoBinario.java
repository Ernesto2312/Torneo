public class NodoBinario {
    String equipo1;
    String equipo2;
    String ganador;
    String ronda;

    NodoBinario izquierda;
    NodoBinario derecha;

    public NodoBinario(String equipo1, String equipo2, String ronda) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.ronda = ronda;
    }
}
