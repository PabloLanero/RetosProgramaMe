package ejercicio713;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//Pendiente de terminar
public class ej713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float cantidadEquipos = sc.nextInt();
        int clasificados = sc.nextInt();
        sc.nextLine();
        HashMap<Integer,equipo> equipos = new HashMap<>();
        ArrayList<Integer> equiposClasificados = new ArrayList<>();


        for (int i = 0; i < cantidadEquipos*((cantidadEquipos-1)/2); i++) {
            int equipoUno = sc.nextInt();
            int equipoDos = sc.nextInt();

            int golesUno = sc.nextInt();
            int golesDos = sc.nextInt();
            sc.nextLine();

            boolean empate = golesUno == golesDos;
            
        }
    }
    
}
