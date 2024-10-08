import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i;
        Equipos re=new Equipos();
        Emparejamiento e=new Emparejamiento();
        Fechas f=new Fechas();
        Creator c = new Creator();
        Scanner sc = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            System.out.println("  ____  _                           _     _       \n" +
                    " | __ )(_) ___ _ ____   _____ _ __ (_) __| | ___  \n" +
                    " |  _ \\| |/ _ \\ '_ \\ \\ / / _ \\ '_ \\| |/ _` |/ _ \\ \n" +
                    " | |_) | |  __/ | | \\ V /  __/ | | | | (_| | (_) |\n" +
                    " |____/|_|\\___|_| |_|\\_/ \\___|_| |_|_|\\__,_|\\___/ \n" +
                    "                                                  ");
            System.out.println("             ___________\n" +
                    "            '._==_==_=_.'\n" +
                    "            .-\\:      /-.\n" +
                    "           | (|:.     |) |\n" +
                    "            '-|:.     |-'\n" +
                    "              \\::.    /\n" +
                    "               '::. .'\n" +
                    "                 ) (\n" +
                    "               _.' '._\n" +
                    "              `\"\"\"\"\"\"\"`");
            System.out.println("Crea tu rol de juego");
            System.out.println("Elija una opccion");
            System.out.println("1.- Registro");
            System.out.println("2.- Equipos Registrados");
            System.out.println("3.- Crear Toreno");
            System.out.println("4.- Actualizar Torneo");
            System.out.println("5.- Escriba -salir- para abandonar el programa ");

            i= sc.nextInt();
            sc.nextLine();

            switch (i) {
                case 1:
                    re.Registro();
                    break;
                case 2:
                    re.MostrarEquipos();
                    break;
                case 3:
                    e.equipos=re.equipos;
                    e.numEquipos=re.numEquipos;
                    e.Rol(f);
                    break;
                case 4:
                    re.actualizarEquipos();
                    re.Registro();
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