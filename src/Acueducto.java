import java.util.ArrayList;
import java.util.Scanner;

public class Acueducto {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        sc.nextLine();
        while(casos !=0){
            int[] puntos = new int[casos];
            int valorMasAlto = 0;
            int posicionMasAlto=0;
            for (int i = 0; i < puntos.length; i++) {
                puntos[i] = sc.nextInt();
                if(puntos[i]+i>valorMasAlto){
                    valorMasAlto = puntos[i];
                    posicionMasAlto = i;
                }
            }
            sc.nextLine();

            for (int i = 0; i < puntos.length; i++) {
                System.out.printf("%s ",valorMasAlto-(puntos[i]-posicionMasAlto--));
            }
            System.out.println("\r\n");


            casos = sc.nextInt();
            sc.nextLine();
        }
    }
}
