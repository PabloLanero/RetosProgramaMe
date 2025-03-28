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
            equipos.putIfAbsent(equipoUno, new equipo(0, 0, 0));
            int equipoDos = sc.nextInt();
            equipos.putIfAbsent(equipoDos, new equipo(0, 0, 0));

            int golesUno = sc.nextInt();
            int golesDos = sc.nextInt();
            sc.nextLine();

            boolean empate = golesUno == golesDos;

            if(!empate){
                if(golesUno>golesDos){
                    equipo equi = equipos.get(equipoUno);
                    equi.setPuntos(3);
                    equi.setGf(golesUno);
                    equi.setGc(golesDos);

                    equipo equip = equipos.get(equipoDos);
                    
                    equip.setGf(golesUno);
                    equip.setGc(golesDos);
                }else{
                    equipo equi = equipos.get(equipoDos);
                    equi.setPuntos(3);
                    equi.setGf(golesUno);
                    equi.setGc(golesDos);

                    equipo equip = equipos.get(equipoUno);
                    
                    equip.setGf(golesUno);
                    equip.setGc(golesDos);
                }

            }else{
                equipo equi = equipos.get(equipoUno);
                equi.setPuntos(1);
                equi.setGf(golesUno);
                equi.setGc(golesDos);

                equipo equip = equipos.get(equipoDos);
                equip.setPuntos(1);
                equip.setGf(golesDos);
                equip.setGc(golesUno);
            }
            
        }
    }
    
}
