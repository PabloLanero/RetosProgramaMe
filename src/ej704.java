import java.util.Scanner;

public class ej704 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fila = sc.next();
        sc.nextLine();
        //Aqui tenemos las dimensiones
        int columnas = fila.length();
        int filas = 0;
        //----------------------------
        String casos=fila;

        while(casos.length()==columnas){
            filas++;
            casos =sc.nextLine();
        }
        int caso = Integer.parseInt(casos);
        

        for (int i = 0; i < caso; i++) {
            int tope = sc.next().trim().length();
            int base = sc.next().trim().length();
            int izquierda = sc.next().trim().length();
            int derecha = sc.nextLine().trim().length();

            /*
             * Los resultados iran asi:
             * 1: si no vale
             * 2: si no cabe
             * 3: si cabe justo
             * 4: cabe pero sobra
             */
            int resultado = (tope == base && izquierda== derecha) ? (tope < columnas || izquierda < filas) ? 2 : (tope == columnas && izquierda == filas) ? 3 : 4 : 1;

            switch (resultado) {
                case 1:
                    System.out.println("NO VALE");
                    break;
                case 2:
                    System.out.println("NO CABE");
                    break;
                case 3:
                    System.out.println("CABE JUSTO");
                    break;

                default:
                    System.out.printf("CABE PERO SOBRA %d DE ANCHO Y %d DE ALTO%n",tope-columnas,izquierda-filas);
                    break;
            }
            
        }
        
    }
    
}
