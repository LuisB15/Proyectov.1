
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Registro {
    protected String nombreTorneo;
    protected int numJornadas,numEquipos;
    List<String> registro=new ArrayList<>();
    Scanner sc=new Scanner(System.in);

    public Registro() {
    }

    public Registro(String nombreTorneo, int numEquipos, int numJornadas) {
        this.nombreTorneo = nombreTorneo;
        this.numEquipos = numEquipos;
        this.numJornadas = numJornadas;
    }

    public void registro(){
        System.out.println("Ingrese el nombre del toreno:");
        nombreTorneo = sc.nextLine();
        System.out.println("Cuantos equipos desea registrar? (Recomendamos que sea un numeor par ): ");
        numEquipos = sc.nextInt();
        sc.nextLine();


    }
    public void mostarDatos(){

        System.out.println("Nombre del toreno: "+nombreTorneo);
        System.out.println("Numero de equipos registrado: "+numEquipos);

    }

    public void actulizarDatos(){

        System.out.println("Que datos quiere cambiar? :");
        System.out.println("1. Nombre del torneo");
        System.out.println("2. Numero de equipos registrado");

        int opcion=sc.nextInt();
        sc.nextLine();
        switch(opcion){
            case 1:
                editarTorneo();
                break;
            case 2:
                editarNumEquipos();
                break;

            default:
                System.out.println("Opcion no valida");
        }
    }

    public void editarTorneo (){
        System.out.println("Ingrese el nombre del Toreno:");
        nombreTorneo = sc.nextLine();
        System.out.println("El nombre del Toreno es: "+nombreTorneo);

    }
    public void editarNumEquipos (){
        System.out.println("Ingrese el nuevo numero de equipos:");
        numEquipos = sc.nextInt();
        System.out.println("El nuevo numero de equipos es: "+numEquipos);
    }
}
