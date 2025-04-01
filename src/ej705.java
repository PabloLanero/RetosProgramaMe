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
            int piedras = sc.nextInt();
            sc.nextLine();

            int capadidadDeSaltoInicial=0;
            int capacidadDeSaltoActual=0;

            int piedraAnterior = 0;

            for (int piedra = 0; piedra < piedras; piedra++) {
                int piedraSiguiente = sc.nextInt();
                int distancia = piedraSiguiente-piedraAnterior;
                piedraAnterior = piedraSiguiente;
                if(capacidadDeSaltoActual<distancia && piedraAnterior>0){
                    capadidadDeSaltoInicial = distancia;
                    capacidadDeSaltoActual = capadidadDeSaltoInicial - 1;

                }
            }
            

            System.out.println(capadidadDeSaltoInicial);
        }



        sc.close();

    }
    
}
