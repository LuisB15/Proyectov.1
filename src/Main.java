import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i;
        Creator c = new Creator();//objeto
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
            System.out.println("1.- Registro");
            System.out.println("2.- Equipos Registrados");
            System.out.println("3.- Crear Torneo");
            System.out.println("4.- Actualizar Torneo");
            System.out.println("5.- Escriba -salir- para abandonar el programa ");

            i= sc.nextInt();
            sc.nextLine();//liberar buffer

            switch (i) {
                case 1:
                    c.Registro();
                    break;
                case 2:
                    c.MostrarEquipos();
                    break;
                case 3:

                    c.Rol();
                    break;
                case 4:
                    c.actualizarEquipos();
                    c.Registro();
                    break;
                case 5:
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