import java.util.Scanner;

public class VueltasCiclista {
    /*
    Casos de entrada:
PROLOGO 50
PLANA 220
MONTANA 120
MEDIA-ALTURA 140
PLANA 120
ALTURA 120
PLANA 200
ALTURA 80
FIN 50
     */
    public static void main (String[] args) {

        int vueltas =0;
        String etapa = "";
        int kilometros =0;
        Scanner sc = new Scanner(System.in);
        while(vueltas<10 && !etapa.contains("FIN")){
            etapa = sc.next();
            int distancia = sc.nextInt();
            sc.nextLine();
            String ok = "OK";

            //Primero sumamos la distancia
            if(distancia <200){

                kilometros+=distancia;
            }else if(distancia>=300){
                vueltas--;
            }else{
                ok = "KO";
            }

            //Ahora comprobamos que sea prologo, fin o cualquier otra cosa
            if(etapa.contains("PROLOGO") || etapa.contains("FIN"))ok ="";
            System.out.println(ok);
            vueltas++;
        }
        System.out.println(kilometros);
        System.out.println(vueltas-2);
    }
}
