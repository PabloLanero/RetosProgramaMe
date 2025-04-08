import java.util.Scanner;

public class ej697 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanyo = sc.nextInt();
        sc.nextLine();
        int[][] galaxia = new int[tamanyo][tamanyo];
        //Rellenamos la galaxia
        for (int i = 0; i < galaxia.length; i++) {
            for (int j = 0; j < galaxia[i].length; j++) {
                galaxia[i][j] = sc.nextInt();
            }
        }

        //Ahora vamos a gestionar las direcciones, siendo estas ARRIBA, DERECHA, ABAJO e IZQUIERDA, luego volvera a empezar desde el principio
        String direccion = "ARRIBA";
        //Para empezar desde el centro
        int fila = tamanyo/2;
        int columna = tamanyo/2;
        int suma = 0;
        for (int i = 1; ((fila>=0 && columna>=0) && (fila<galaxia.length && columna<galaxia.length)); i++) {
            for (int j = 0; j < i; j++) {
                switch (direccion) {
                    case "ARRIBA":
                        suma +=galaxia[fila--][columna];
                        
                        break;
                
                    case "DERECHA":
                        suma +=galaxia[fila][columna++];
                        
                        break;

                    case "ABAJO":
                        suma +=galaxia[fila++][columna];
                        
                        break;
                    
                    case "IZQUIERDA":
                        suma +=galaxia[fila][columna--];
                        
                        break;
                    
                }



            }

            switch (direccion) {
                case "ARRIBA":
                        
                        direccion = "DERECHA";
                        break;
                
                    case "DERECHA":
                        
                        direccion="ABAJO";
                        break;

                    case "ABAJO":
                        
                        direccion="IZQUIERDA";
                        break;
                    
                    case "IZQUIERDA":
                        
                        direccion="ARRIBA";
                        break;
            }

            
            
        }
        System.out.println(suma);
    }
    
}
