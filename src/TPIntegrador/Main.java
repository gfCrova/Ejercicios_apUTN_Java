package TPIntegrador;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Partido partido1 = new Partido();

        Equipo argentina = new Equipo("Argentina", "AFA");
        Equipo brasil = new Equipo("Brasil", "CBF");

        partido1.setEquipoLocal(argentina);
        partido1.setEquipoVisitante(brasil);

        partido1.getEquipoLocal().setCantidadGoles(2);
        partido1.getEquipoVisitante().setCantidadGoles(1);

        partido1.resultadoPartido();
        System.out.println("\n");

        Partido partido2 = new Partido();
        Equipo uruguay = new Equipo("Uruguay", "AFA");
        Equipo chile = new Equipo("Chile", "CBF");

        partido2.setEquipoLocal(uruguay);
        partido2.setEquipoVisitante(chile);

        partido2.getEquipoLocal().setCantidadGoles(2);
        partido2.getEquipoVisitante().setCantidadGoles(2);

        partido2.resultadoPartido();
    }
}
