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
        int[] equiposClasificados = new int[clasificados];

        for (int i = 0; i < equiposClasificados.length; i++) {
            equiposClasificados[i]= i+1;
        }

        for (int i = 0; i < cantidadEquipos*((cantidadEquipos-1)/2); i++) {
            int equipoUno = sc.nextInt();
            equipos.putIfAbsent(equipoUno, new equipo(0, 0, 0));
            int equipoDos = sc.nextInt();
            equipos.putIfAbsent(equipoDos, new equipo(0, 0, 0));

            int golesUno = sc.nextInt();
            int golesDos = sc.nextInt();
            sc.nextLine();

            int caso = golesUno>golesDos ? 1: (golesUno<golesDos ? 2: 0);

            switch (caso) {
                //Aqui gana el primer equipo que se escriba
                case 1:
                    equipo equiUnoGana = equipos.get(equipoUno);
                    equiUnoGana.setPuntos(3);
                    equiUnoGana.setGf(golesUno);
                    equiUnoGana.setGc(golesDos);

                    equipo equipDosPierde = equipos.get(equipoDos);
                    
                    equipDosPierde.setGf(golesUno);
                    equipDosPierde.setGc(golesDos);
                    break;
                //Aqui gana el segundo equipo que se escriba
                case 2:
                 
                    equipo equiDosGana = equipos.get(equipoDos);
                    equiDosGana.setPuntos(3);
                    equiDosGana.setGf(golesUno);
                    equiDosGana.setGc(golesDos);

                    equipo equipUnoPierde = equipos.get(equipoUno);
                    
                    equipUnoPierde.setGf(golesUno);
                    equipUnoPierde.setGc(golesDos);
                    break;
            
                //En caso de empate..
                default:

                    equipo equi = equipos.get(equipoUno);
                    equi.setPuntos(1);
                    equi.setGf(golesUno);
                    equi.setGc(golesDos);

                    equipo equip = equipos.get(equipoDos);
                    equip.setPuntos(1);
                    equip.setGf(golesDos);
                    equip.setGc(golesUno);
                    break;
            }

            
            
        }

        //Ahora queda compararlos

        for(Integer numero :equipos.keySet()){

            //Primero antes que nada, vamos a comprobar si esta clasificado o no
            boolean estaClasificado = false;
            for (int i = 0; i < equiposClasificados.length && !estaClasificado; i++) {
                estaClasificado = equiposClasificados[i] == numero;
            }


            for(int i =0; i < equiposClasificados.length && !estaClasificado; i++){
                equipo equipoCandidatoAClasificarse = equipos.get(numero);
                equipo equipoClasificado = equipos.get(equiposClasificados[i]);

                //Si devuelve 1 se clasifica, quitando al otro
                int caso = equipoClasificado.getPuntos()>equipoCandidatoAClasificarse.getPuntos() ? 0 : (equipoClasificado.getPuntos() == equipoCandidatoAClasificarse.getPuntos() &&
                (equipoClasificado.getGf() - equipoClasificado.getGc() > equipoCandidatoAClasificarse.getGf() - equipoCandidatoAClasificarse.getGc()) ? 0 : equipoClasificado.getGf()>equipoCandidatoAClasificarse.getGf() ? 0 :1);


                switch (caso) {
                    case 1:

                        int aux = equiposClasificados[i]; 
                        equiposClasificados[i] = numero;
                        int aux2=0;
                        //Vamos a empujar a todos hasta que de error
                        for (int j = i+1; j < equiposClasificados.length-1; j++) {
                            aux2 = equiposClasificados[j];
                            equiposClasificados[j] = aux;
                            equiposClasificados[j+1] = aux2;
                        }
                    
                        estaClasificado = true;
                        break;
                
                    default:
                        break;
                }

            }
        }


        for (int i = 0; i < equiposClasificados.length; i++) {
            System.out.print(equiposClasificados[i]+" ");
        }

    }
    
}
