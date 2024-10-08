import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fechas extends Emparejamiento {
    public Fechas() {
        super();

    }

    public Fechas(List<String> equipos, Scanner sc, int numEquipos, String nombreTorneo, List<LocalDate> fechas) {
        super(equipos, sc, numEquipos, nombreTorneo);
        this.fechas = fechas;
    }

    private List<LocalDate> fechas = new ArrayList<>();
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