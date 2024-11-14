import java.util.*;

public class Jugadores extends Equipos {

    List<String> jugadores = new ArrayList<>();
    HashMap<String, ArrayList<Jugador>> JugadoresEquipo = new HashMap<>();  // Inicializar aquí
    int maxJugadores = 10 ;
    Scanner sc = new Scanner(System.in);

    public Jugadores(List<String> jugadores, HashMap<String, ArrayList<Jugador>> jugadoresEquipo, int maxJugadores, Scanner sc) {
        this.jugadores = jugadores;
        JugadoresEquipo = jugadoresEquipo != null ? jugadoresEquipo : new HashMap<>();  // Asegurarse de no ser nulo
        this.maxJugadores = maxJugadores;
        this.sc = sc;
    }

    public Jugadores(String nombreTorneo, int numEquipos, int numJornadas, List<String> equipos, Scanner sc, String equipoSeleccionado, List<String> jugadores, HashMap<String, ArrayList<Jugador>> jugadoresEquipo, int maxJugadores, Scanner sc1) {
        super(nombreTorneo, numEquipos, numJornadas, equipos, sc, equipoSeleccionado);
        this.jugadores = jugadores;
        JugadoresEquipo = jugadoresEquipo;
        this.maxJugadores = maxJugadores;
        this.sc = sc1;
    }

    public Jugadores() {}

    class Jugador {
        String nombre, facultad;
        int edad;

        public Jugador(String nombre, String facultad, int edad) {
            this.nombre = nombre;
            this.facultad = facultad;
            this.edad = edad;
        }

        @Override
        public String toString() {
            return "Jugador:" + "Nombre:" + nombre + ", facultad:" + facultad +   ", Edad:" + edad ;
        }
    }

    public void selecEquipo() {
        System.out.println("Seleccione un equipo");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println(i + 1 + ". " + equipos.get(i));
        }
        System.out.println("Seleccione un equipo ingresando el número ");
        int indice = sc.nextInt() - 1;
        sc.nextLine();

        if (indice >= 0 && indice < equipos.size()) {
            equipoSeleccionado = equipos.get(indice);
            System.out.println("Equipo seleccionado :" + equipoSeleccionado);

        } else {
            System.out.println("No existe un equipo");
            selecEquipo();
        }
    }

    public void registroJugador() {
        selecEquipo();
        System.out.println("Registro para el equipo " + equipoSeleccionado);
        ArrayList<Jugador> jugadoresEquipo = new ArrayList<>();

        while (jugadoresEquipo.size() < maxJugadores) {
            System.out.println("Ingrese los datos del jugador " + (jugadoresEquipo.size() + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Facultad: ");
            String facultad = sc.nextLine();

            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();

            Jugador jugador = new Jugador(nombre, facultad, edad);
            jugadoresEquipo.add(jugador);

            if (jugadoresEquipo.size() < maxJugadores) {
                System.out.println("¿Desea agregar a otro jugador?");
                String response = sc.nextLine();
                if (response.equals("no")) {
                    break;
                }
            }
        }
        JugadoresEquipo.put(equipoSeleccionado, jugadoresEquipo);
        System.out.println("Número de equipos registrados: " + JugadoresEquipo.size());
    }


    public void mostrarJugadores() {
        System.out.println("Jugadores:");
        for (Map.Entry<String, ArrayList<Jugador>> entry : JugadoresEquipo.entrySet()) {
            System.out.println("Equipo: " + entry.getKey());
            for (Jugador jugador : entry.getValue()) {
                System.out.println(jugador);
            }
        }
    }

    public void editarInfo() {
        if (JugadoresEquipo.isEmpty()) {
            System.out.println("No existe un equipo");
            return;
        }

        mostrarJugadores();

        System.out.println("Seleccione que equipo quiere modificar: ");
        String equipoSeleccionado = sc.nextLine();
        if (JugadoresEquipo.containsKey(equipoSeleccionado)) {
            ArrayList<Jugador> jugadoresEquipo = JugadoresEquipo.get(equipoSeleccionado);
            System.out.print("Seleccione el número del jugador para editar (1-" + jugadoresEquipo.size() + "): ");
            int index = sc.nextInt() - 1;
            sc.nextLine(); // Liberar el buffer

            if (index >= 0 && index < jugadoresEquipo.size()) {
                Jugador jugador = jugadoresEquipo.get(index);
                System.out.println("Editando datos del jugador " + (index + 1) + ":");
                System.out.print("Nuevo nombre (actual: " + jugador.nombre + "): ");
                jugador.nombre = sc.nextLine();

                System.out.print("Nueva facultad (actual: " + jugador.facultad + "): ");
                jugador.facultad = sc.nextLine();

                System.out.print("Nueva edad (actual: " + jugador.edad + "): ");
                jugador.edad = sc.nextInt();
                sc.nextLine(); // Liberar el buffer

                System.out.println("Datos actualizados correctamente");
            } else {
                System.out.println("Número de jugador inválido");
            }
        } else {
            System.out.println("Equipo no encontrado");
        }
    }
}
