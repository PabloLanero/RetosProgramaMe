import java.util.ArrayList;
import java.util.Scanner;

//Preguntar por que la salida debe salir asi, problemas con la comprension del ejercicio

public class ej726{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int canales = sc.nextInt();
        int personas = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> canalesPreferidos = new ArrayList<>(0);
        ArrayList<Integer> canalesProhibidos = new ArrayList<>(0);
        for (int i = 0; i < personas; i++) {
            int canalPreferido = sc.nextInt();
            int canalProhibido = sc.nextInt();
            sc.nextLine();
            if (!canalesPreferidos.contains(canalPreferido))canalesPreferidos.add(canalPreferido);
            if (!canalesProhibidos.contains(canalProhibido))canalesProhibidos.add(canalProhibido);

        }


        int canalesEnPaz = canales - canalesProhibidos.size();
        int canalesBloqueados = 0;
        for( int canal : canalesProhibidos){
            if(canalesPreferidos.contains(canal)){
                canalesBloqueados++;
                canales--;
            }
        }
        System.out.println(canales + " "+ canalesBloqueados );
    }
}