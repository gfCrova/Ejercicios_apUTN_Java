package TPIntegrador;

public class Partido {

    private Equipo equipoLocal;
    private Equipo equipoVisitante;

    ResultadoEnum enumGanador = ResultadoEnum.GANADOR;
    ResultadoEnum enumPerdedor = ResultadoEnum.PERDEDOR;
    ResultadoEnum enumEmpate = ResultadoEnum.EMPATE;

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo local) {
        this.equipoLocal = local;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo visitante) {
        this.equipoVisitante = visitante;
    }

    public ResultadoEnum resultadoPartido() {
        if( equipoLocal.getCantidadGoles() > equipoVisitante.getCantidadGoles()) {
            System.out.println("Resultado del partido: \n" +
                                enumGanador.name() + ": " + equipoLocal.getNombre() + " " + equipoLocal.getCantidadGoles() + "\n" +
                                enumPerdedor.name() + ": " + equipoVisitante.getNombre() + " " + equipoVisitante.getCantidadGoles());
            return ResultadoEnum.GANADOR;
        } else if( equipoLocal.getCantidadGoles() < equipoVisitante.getCantidadGoles()) {
            System.out.println("Resultado del partido: \n" +
                                enumGanador.name() + ": " + equipoVisitante.getNombre() + "\n" +
                                enumPerdedor.name() + ": " + equipoLocal.getNombre());
            return ResultadoEnum.GANADOR;
        } else {
            System.out.println("Resultado del partido: \n" +
                                enumEmpate.name() + ": " + equipoLocal.getNombre() + " " + equipoLocal.getCantidadGoles() + " - " + equipoVisitante.getNombre() + " " + equipoVisitante.getCantidadGoles());
            return ResultadoEnum.EMPATE;
        }
    }
}
