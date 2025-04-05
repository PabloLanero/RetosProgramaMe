import java.util.Scanner;

public class ej699 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ecuacion = sc.nextLine();
        String[] grados = ecuacion.split("x");
        for (int i = 0; i < grados.length; i++) {
            System.out.println(grados[i]);
        }
        
        
    }
    
}
