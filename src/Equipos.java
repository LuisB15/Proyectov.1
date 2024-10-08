import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;


public class Equipos {
    List<String> equipos=new ArrayList<>();
    private List<LocalDate> fechas = new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    int numEquipos;
    String nombreTorneo;

    public Equipos(List<String> equipos, Scanner sc, int numEquipos,String nombreTorneo) {
        this.equipos = equipos;
        this.sc = sc;
        this.numEquipos = numEquipos;
        this.nombreTorneo = nombreTorneo;
    }

    public Equipos() {
    }

    public void Registro(){


        System.out.println("Ingrese el nombre del toreno:");
        nombreTorneo = sc.nextLine();
        System.out.println("Cuantos equipos desea registrar (Recomendamos que sea un numeor par ): ");
        numEquipos = sc.nextInt();
        System.out.println("Ingrese los equipos del torneo");
        sc.nextLine();
        for(int i=0;i<numEquipos;i++){
            System.out.println("\n Equipo"+ (i+1)+":" );
            String equipo =sc.nextLine();
            equipos.add(equipo);
        }
    }
    public void MostrarEquipos(){
        System.out.println("Estos son los equipos registrados");
        Iterator it=equipos.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    public void actualizarEquipos(){
        equipos.clear();
    }

}
