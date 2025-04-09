import java.util.Scanner;

public class CampanasManquita {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String palabra = sc.nextLine();
            int longitud = palabra.trim().length()%2==0 ? palabra.trim().length(): palabra.trim().length()+1;
            boolean puede = true;
            for (int i = 0; i < palabra.length() && puede; i++) {
                char letra = palabra.charAt(i);
                int contadorLetra = 0;
                for (int j = 0; j < palabra.length(); j++) {
                    if(letra == palabra.charAt(j))contadorLetra++;
                }
                if(contadorLetra>longitud/2)puede = false;
            }
            String podra = puede ? "SI" : "NO";
            System.out.println(podra);

        }
    }
}
