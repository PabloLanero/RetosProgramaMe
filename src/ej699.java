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
        int coeficiente = 1;
        int potencia =0;

        for (int i = 0; i < grados.length; i++) {
            if(grados[i].contains("^")){
                String numero = grados[i].replace('^', '0');
                String[] numeros = numero.split("[+]");
                potencia = Integer.valueOf(numeros[0]);
                boolean potenciaUno = potencia-1 ==1;
                if(potenciaUno)System.out.printf("%dx+",coeficiente*potencia);
                else System.out.printf("%dx^%d+",coeficiente*potencia,potencia-1);
                if(numeros.length==2){
                    coeficiente = Integer.valueOf(numeros[1]);
                }else{
                    coeficiente=1;
                }
                
            }else if(i+1 != grados.length){
                coeficiente = Integer.parseInt(grados[i]);
            }
        }
        System.out.printf("%s%n",coeficiente);
        
        
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
