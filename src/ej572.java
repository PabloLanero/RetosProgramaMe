import java.util.Scanner;

public class ej572 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        
        for (int i = 0; i < casos; i++) {
            boolean hayNueve = false;
            boolean hayCero= false;
            for (int j = 0; j < 5; j++) {
                float nota = sc.nextFloat();
                if(nota >=9) hayNueve=true;
                if(nota==0) hayCero= true;

            }
            if(hayNueve) System.out.println("MEDIA");
            else if (hayCero)System.out.println("SUSPENSO DIRECTO");
            else System.out.println("MEDIA");
        }
        sc.close();
    }
    
}
