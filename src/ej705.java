import java.util.Scanner;


/*
 * Entrada de ejemplo
2
2
5 10
5
1 6 7 11 13
 * 
 */


public class ej705 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        sc.nextLine();
        for (int caso = 0; caso < casos; caso++) {
            int cantidadPiedras = sc.nextInt();
            sc.nextLine();

            int capadidadDeSaltoInicial=0;
            int capacidadDeSaltoActual=0;

            int[] piedras = new int[cantidadPiedras];
            

            for (int piedra = 0; piedra < piedras.length; piedra++) {
                piedras[piedra] = sc.nextInt();
                
            }
            

            int piedraAnterior =0;
            int piedraActual =0;
            for (int i = 0; i < piedras.length; i++) {
                piedraActual = piedras[i];
                int distancia = piedraActual - piedraAnterior;
                boolean volvemosAEmpezar= false;
                if(capacidadDeSaltoActual==distancia /*|| capadidadDeSaltoInicial==distancia*/)capacidadDeSaltoActual--;
                else if(capacidadDeSaltoActual<distancia){
                    capadidadDeSaltoInicial++;
                    capacidadDeSaltoActual = capadidadDeSaltoInicial;
                    i=-1;
                    volvemosAEmpezar= true;
                }
                piedraAnterior = volvemosAEmpezar ? 0: piedras[i];
            }



            System.out.println(capadidadDeSaltoInicial);
        }



        sc.close();

    }
    
}
