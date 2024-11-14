import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Equipos> equipos=new ArrayList<>();
        int i;
        Equipos e=new Equipos();

        Jugadores j = new Jugadores();
        Torneo t = new Torneo();
        Fechas f = new Fechas();
        SimulacionTorneo s = new SimulacionTorneo();
        Scanner sc = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            System.out.println("  _   ___    _   ____           ____   _   _   _____                 ");
            System.out.println(" | | |   \\  | | /  __|        /  ___| | | | | |  _  \\               ");
            System.out.println(" | | | |\\ \\ | | | | __        | |     | | | | | |_| |                   ");
            System.out.println(" | | | | \\ \\| | | |_\\ \\  _    | |___  | |_| | |  ___/                ");
            System.out.println(" |_| |_|  \\___| \\_____/ (_)   \\_____|  \\___/  |_|                       ");
            System.out.println("                                                              ");
            System.out.println("             !!B I E N V E N I D O!!                            ");
            System.out.println("                    ING. CUP                           ");
            System.out.println();
            System.out.println("                _____\n" +
                    "              '.=====.'\n" +
                    "            .-\\:      /-.\n" +
                    "           | (|:.     |) |\n" +
                    "            '-|:.     |-'\n" +
                    "              \\::.    /\n" +
                    "               '::. .'\n" +
                    "                 ) (\n" +
                    "               .' '.\n" +
                    "              \"\"\"\"\"\"\"");
            System.out.println("Crea tu rol de juego");
            System.out.println("Elija una opccion");
            System.out.println("1.- Crear torneo");
            System.out.println("2.- Registrar Equipos");
            System.out.println("3.- Registrar Jugadores");
            System.out.println("4.- Crear Torneo");
            System.out.println("5.- Editar Torneo");
            System.out.println("6.- Simular Torneo");
            System.out.println("7.- Escriba -salir- para abandonar el programa ");

            i= sc.nextInt();
            sc.nextLine();//liberar buffer

            switch (i) {
                case 1:
                    e.registro();


                    break;
                case 2:
                    e.registroEquipos();
                    e.mostrarDatos();

                    break;

                case 3:
                    j.equipos=e.equipos;
                    j.registroJugador();
                    j.mostrarJugadores();
                    break;
                case 4:
                    t.equipos=e.equipos;
                    t.numEquipos=e.numEquipos;
                    t.nombreTorneo=e.nombreTorneo;
                    t.Rol(f);
                    break;
                case 5:
                    System.out.println("Elija una opccion");
                    System.out.println("1.- Editar Datos del Torneo");
                    System.out.println("2.- Editar Equipos");
                    System.out.println("3.- Editar Jugadores");

                    int i2 = sc.nextInt();
                    sc.nextLine();
                    switch (i2) {
                        case 1:
                            e.actualizarDatos();
                            break;
                        case 2:
                            e.actulizarEquipos();
                            break;
                        case 3:
                            j.editarInfo();
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                    break;

                case 6:
                    s.equipos=e.equipos;
                    s.nombreTorneo=e.nombreTorneo;
                    s.numEquipos=e.numEquipos;
                    s.simularTorneo();
                    break;


                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

            System.out.println();

        }
        sc.close();
    }
}