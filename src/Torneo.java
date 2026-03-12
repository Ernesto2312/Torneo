public class Torneo {

    NodoBinario raiz;

    public Torneo(String[] equipos) {

        NodoBinario qf1 = new NodoBinario(equipos[0], equipos[1], "Cuartos");
        NodoBinario qf2 = new NodoBinario(equipos[2], equipos[3], "Cuartos");
        NodoBinario qf3 = new NodoBinario(equipos[4], equipos[5], "Cuartos");
        NodoBinario qf4 = new NodoBinario(equipos[6], equipos[7], "Cuartos");

        NodoBinario semi1 = new NodoBinario(null, null, "Semifinal");
        NodoBinario semi2 = new NodoBinario(null, null, "Semifinal");

        semi1.izquierda = qf1;
        semi1.derecha = qf2;

        semi2.izquierda = qf3;
        semi2.derecha = qf4;

        NodoBinario finalPartido = new NodoBinario(null, null, "Final");

        finalPartido.izquierda = semi1;
        finalPartido.derecha = semi2;

        raiz = finalPartido;
    }

    public void simularRonda(NodoBinario nodo) {

        if (nodo.equipo1 == null || nodo.equipo2 == null)
            return;

        double r = Math.random();

        if (r < 0.5)
            nodo.ganador = nodo.equipo1;
        else
            nodo.ganador = nodo.equipo2;
    }

    public void recorrerYSimular(NodoBinario nodo) {

        if (nodo == null)
            return;

        recorrerYSimular(nodo.izquierda);
        recorrerYSimular(nodo.derecha);

        if (nodo.izquierda != null && nodo.derecha != null) {

            nodo.equipo1 = nodo.izquierda.ganador;
            nodo.equipo2 = nodo.derecha.ganador;
        }

        simularRonda(nodo);
    }

    public void mostrarBracket(NodoBinario nodo, String prefijo) {

        if (nodo == null)
            return;

        System.out.println(prefijo + nodo.ronda + ": "
                + nodo.equipo1 + " vs "
                + nodo.equipo2
                + " → Ganador: "
                + nodo.ganador);

        mostrarBracket(nodo.izquierda, prefijo + "   ");
        mostrarBracket(nodo.derecha, prefijo + "   ");
    }

    public String campeon() {
        return raiz.ganador;
    }

}