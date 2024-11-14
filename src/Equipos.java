import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;

public class Equipos extends Registro {


    List<String> equipos = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String equipoSeleccionado;

    public Equipos() {
        super();
    }

    public Equipos(String nombreTorneo, int numEquipos, int numJornadas, List<String> equipos, Scanner sc, String equipoSeleccionado) {
        super(nombreTorneo, numEquipos, numJornadas);
        this.equipos = equipos;
        this.sc = sc;
        this.equipoSeleccionado = equipoSeleccionado;
    }

    public void registro() {
        super.registro();
    }
    public void actualizarDatos(){
        super.actulizarDatos();

    }

    public void registroEquipos() {
        System.out.println("Ingerese el nombre de los equipos");
        System.out.print(numEquipos);
        for (int i = 0; i < numEquipos; i++) {
            System.out.println("\n Equipo" + (i + 1) + ":");
            String equipo = sc.nextLine();
            equipos.add(equipo);
        }
    }

    public void mostrarDatos() {
        super.mostarDatos();
        System.out.println("Estos son los equipos registrados");
        Iterator it = equipos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void actulizarEquipos() {
        System.out.println("Que accion quiere hacer:");
        System.out.println("1. Agregar equipo");
        System.out.println("2. Eliminar equipo");

        int op = sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 1:
                agurgarEquipo();
                break;
            case 2:
                eliminarEquipo();
                break;

            default:
                System.out.println("Opcion no valida");
        }
    }
    public void agurgarEquipo() {
        System.out.println("Ingrese el nombre del equipo:");
        String nuevoEquipo = sc.nextLine();
        equipos.add(nuevoEquipo);
        System.out.println("Equipo agregado exitosamente");
        mostrarDatos();
    }
    public void eliminarEquipo() {
        System.out.println("Ingrese el nombre del equipo que desea eliminar:");
        String eliminar = sc.nextLine();
        if (equipos.remove(eliminar)) {
            System.out.println("El equipo"+eliminar+" eliminado exitosamente");

        }else {
            System.out.println("El equipo "+eliminar+" no existe");
        }
    }


}
