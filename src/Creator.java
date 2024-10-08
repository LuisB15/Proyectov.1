import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;


public class Creator {
    List<String> equipos=new ArrayList<>();
    private List<LocalDate> fechas = new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    int numEquipos;
    String nombreTorneo;

    public Creator(List<String> equipos, Scanner sc, int numEquipos,String nombreTorneo) {
        this.equipos = equipos;
        this.sc = sc;
        this.numEquipos = numEquipos;
        this.nombreTorneo = nombreTorneo;
    }

    public Creator() {
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
    public void Rol(){

        System.out.println("Rol de juegos ");
        System.out.println("Local    Visitante ");

        generarFechas(numEquipos-1);

        if (numEquipos % 2 != 0 ){
            equipos.add("Descansas");
            numEquipos ++;
        }

        for(int round = 0; round < numEquipos -1 ; round++){
            System.out.println("\nJornada  " + (round+1)+"     Fecha :" +getFechas().get(round));
            for( int i =0 ; i < numEquipos/2 ; i++){
                int local=i;
                int visitante = (numEquipos-1-i+round)%(numEquipos-1);

                if(i==0){
                    visitante=numEquipos-1;
                }
                System.out.println(equipos.get(local)+"   vs   "+equipos.get(visitante));

            }
            System.out.println();
        }
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