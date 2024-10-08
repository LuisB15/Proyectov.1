import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Emparejamiento extends Equipos{
    public Emparejamiento() {
        super();
    }

    public Emparejamiento(List<String> equipos, Scanner sc, int numEquipos, String nombreTorneo) {
        super(equipos, sc, numEquipos, nombreTorneo);
    }

    //se usa el algoritmo round-robin , basicamente es un algoritmo de "todos contra todos" que nos va a servir para hacer el emparejamiento de los equipos

    public void Rol(Fechas f){

        System.out.println("Rol de juegos ");
        System.out.println("Local    Visitante ");

        f.generarFechas(numEquipos-1);

        if (numEquipos % 2 != 0 ){
            equipos.add("Descansas");
            numEquipos ++;
        }

        for(int round = 0; round < numEquipos -1 ; round++){
            System.out.println("\nJornada  " + (round+1)+"     Fecha :" +f.getFechas().get(round));
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
}
//Podriamos pedir solamente un numero de equipos par o usar el if de abajo para que el emparejamientop se equitativo
