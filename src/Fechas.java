import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Fechas extends Torneo {

    List<LocalDate> fechas = new ArrayList<>();
    public Fechas() {
        super();
    }

    public Fechas(List<LocalDate> fechas) {
        this.fechas = fechas;
    }

    public Fechas(String nombreTorneo, int numEquipos, int numJornadas, List<String> equipos, Scanner sc, List<LocalDate> fechas,String equipoSeleccionado) {
        super(nombreTorneo, numEquipos, numJornadas, equipos, sc,equipoSeleccionado);
        this.fechas = fechas;
    }

    public void generarFechas(int numJornadas) {
        LocalDate fechaInicial = LocalDate.now();
        for (int i = 0; i < numJornadas; i++) {
            fechas.add(fechaInicial.plusDays(i * 7));
        }
    }
    public List<LocalDate> getFechas() {
        return fechas;
    }
}