
import java.util.Date;
import java.util.Scanner;

public class ej703{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < casos; i++) {
            
            
            float kilometros =0;
            String linea = sc.nextLine();
            Scanner sk = new Scanner(linea);
            while(sk.hasNext()){
                String tiempo = sk.next();
                int distanciaRecorrida = sk.nextInt();
                int velocidad = sk.nextInt();
                
                String[] tiempos = tiempo.split(":");

                float horas = Float.parseFloat(tiempos[0]) + (Float.parseFloat(tiempos[1])/60);
                kilometros += velocidad*horas;
            }
            sk.close();
            
            System.out.println(kilometros); 
            /* 
            System.out.println(tiempo);
            System.out.println(distanciaRecorrida);
            System.out.println(velocidad);
            */
        }
    }
}