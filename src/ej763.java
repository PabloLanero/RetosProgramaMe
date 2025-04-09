import java.util.Scanner;

public class ej763 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < casos; i++) {
            String palabra = sc.nextLine();
            if(palabra.equalsIgnoreCase("colgadas")) System.out.println("Bien");
            else System.out.println("Mal");
        }
    }
    
}
