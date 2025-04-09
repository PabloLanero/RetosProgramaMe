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
            //Aqui primero, antes que nada vamos a recoger la cantidad de piedras que se van a contar
            int cantidadPiedras = sc.nextInt();
            sc.nextLine();

            int capadidadDeSaltoInicial=0;
            int capacidadDeSaltoActual=0;

            int[] piedras = new int[cantidadPiedras];
            

            for (int piedra = 0; piedra < piedras.length; piedra++) {
                piedras[piedra] = sc.nextInt();
                
            }
            

            //Ahora vamos a recorrer las piedras
            int piedraAnterior =0;
            int piedraActual =0;
            for (int i = 0; i < piedras.length; i++) {
                //Partimos desde 0 para contar y la proxima que contemos sera la primera piedra que se haya dicho
                piedraActual = piedras[i];
                int distancia = piedraActual - piedraAnterior;
                boolean volvemosAEmpezar= false;
                //Aqui comprobamos si podemos saltar y si se nos resta capacidad de salto o no
                if(capacidadDeSaltoActual==distancia)capacidadDeSaltoActual--;
                //En caso de que no lleguemos a poder saltar, se nos sumara 1 a la capacidad de salto inicial y volveremos a empezar desde el principio
                else if(capacidadDeSaltoActual<distancia){
                    capadidadDeSaltoInicial++;
                    capacidadDeSaltoActual = capadidadDeSaltoInicial;
                    //En vez de poner 0, ponemos -1 para que en la siguiente iteraccion, se le sumara 1 y tendra el valor 0
                    
                    i=-1;
                    //Y con este boolean le indicaremos si la piedra anterior es en la que estamos o si tiene que ser 0
                    //(No os podeis imaginar como me ha tocado los huevos esta parte)
                    volvemosAEmpezar= true;
                }
                //Y aqui un valor ternario para hacer que el profe se sienta orgulloso
                piedraAnterior = volvemosAEmpezar ? 0: piedras[i];
            }
            System.out.println(capadidadDeSaltoInicial);
        }
        sc.close();

    }
    
}
