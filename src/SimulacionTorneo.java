import java.util.*;

public class SimulacionTorneo extends Equipos {

    public SimulacionTorneo(String nombreTorneo, int numEquipos, int numJornadas, List<String> equipos, Scanner sc, String equipoSeleccionado) {
        super(nombreTorneo, numEquipos, numJornadas, equipos, sc, equipoSeleccionado);
    }

    public SimulacionTorneo() {
        super();

    }




    public String jugarPartido(String equipo1, String equipo2) {
        Random rand = new Random();
        int golesEquipo1 = rand.nextInt(6);
        int golesEquipo2 = rand.nextInt(6);

        System.out.println(equipo1 + " " + golesEquipo1 + " - " + golesEquipo2 + " " + equipo2);

        if (golesEquipo1 > golesEquipo2) {
            return equipo1;
        } else if (golesEquipo2 > golesEquipo1) {
            return equipo2;
        } else {

            String ganador = rand.nextBoolean() ? equipo1 : equipo2;
            System.out.println("Ganador en penales: " + ganador);
            return ganador;

        }
    }


    public List<String> jugarSemifinales(List<String> equipos) {
        List<String> semifinalistas = new ArrayList<>();

        super.mostrarDatos();

        System.out.println("Ronda de eliminacion");

        for (int i = 0; i < equipos.size(); i += 2) {
            String ganador = jugarPartido(equipos.get(i), equipos.get(i + 1));
            semifinalistas.add(ganador);
        }

        return semifinalistas;
    }


    public String jugarFinal(List<String> equipos) {
        if (equipos.size() < 4) {
            System.out.println("No hay suficientes equipos para las finales.");
            return null;
        }
        String finalista1 = jugarPartido(equipos.get(0), equipos.get(1));
        String finalista2 = jugarPartido(equipos.get(2), equipos.get(3));

        List<String> finalistas = Arrays.asList(finalista1, finalista2);
        System.out.println("Finalistas: " + finalista1 + " vs " + finalista2);

        return jugarPartido(finalista1, finalista2);
    }

    public void simularTorneo() {
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos registrados para simular el torneo.");
            return;
        }

        List<String> semifinalistas = jugarSemifinales(equipos);
        System.out.println("Semifinalistas: " + semifinalistas);

        if (semifinalistas.isEmpty()) {
            System.out.println("No hay semifinalistas suficientes para jugar las finales.");
            return;
        }

        String ganador = jugarFinal(semifinalistas);
        if (ganador != null) {
            System.out.println("Ganador del torneo: " + ganador);
        }
    }
}
