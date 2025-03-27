import java.util.HashMap;
import java.util.Scanner;

public class ej765 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        sc.nextLine();
        while(casos>0 && casos <=1000){
            HashMap<String,Integer> ninosPeques = new HashMap<>();
            HashMap<String,Integer> ninosGrandes = new HashMap<>();
            for (int i = 0; i < casos; i++) {
                String nombre = sc.next();
                boolean peque = nombre.charAt(0)<= 'z' && nombre.charAt(0)>= 'a';
                if(peque){
                    ninosPeques.putIfAbsent(nombre, 0);
                    int puntos = ninosPeques.get(nombre)+1;
                    ninosPeques.put(nombre, puntos);
                }else{
                    ninosGrandes.putIfAbsent(nombre, 0);
                    int puntos = ninosGrandes.get(nombre)+1;
                    ninosGrandes.put(nombre, puntos);
                }
            }
            int mejorValorPeque = 0;
            boolean empatePeques = false;
            String nombreMejorPeque = "";
            boolean empateGrandes = false;
            String nombreMejorGrande = "";
            int mejorValorGrande = 0;
            for(String nombrePeque : ninosPeques.keySet()){
                int puntosPeque = ninosPeques.get(nombrePeque);
                if (mejorValorPeque<puntosPeque){
                    mejorValorPeque = puntosPeque;
                    nombreMejorPeque = nombrePeque;
                    empatePeques = false;
                }
                else if (mejorValorPeque == puntosPeque){
                    empatePeques = true;
                }
            }
            if(empatePeques) System.out.print("empate ");
            else System.out.print(nombreMejorPeque+" ");

            for(String nombreGrande : ninosGrandes.keySet()){
                int puntosGrande = ninosGrandes.get(nombreGrande);
                if (mejorValorGrande<puntosGrande){
                    mejorValorGrande = puntosGrande;
                    nombreMejorGrande = nombreGrande;
                    empateGrandes = false;
                }
                else if (mejorValorGrande == puntosGrande){
                    empateGrandes = true;
                }
            }
            if(empateGrandes) System.out.print("empate ");
            else System.out.print(nombreMejorGrande+" ");

            casos = sc.nextInt();
            sc.nextLine();
            
        }
        sc.close();   
    }
}

