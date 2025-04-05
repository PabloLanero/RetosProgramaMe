import java.util.Scanner;

public class ej699 {

    /**
     * Ejemplo de entrada
        3x^2+2x+3
        3x^4+x
        5x^4+3x^3+2x^2+10x+4
        x
        4
     * 
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ecuacion = sc.nextLine();
        String[] grados = ecuacion.split("x");
        for (int i = 0; i < grados.length; i++) {
            System.out.println(grados[i]);
        }
        
        
    }



    /**
     * Salida
    6x+2
    12x^3+1
    20x^3+9x^2+4x+10
    1
    0
     * 
     */
    
}
