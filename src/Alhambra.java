import java.util.Scanner;

public class Alhambra {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] jardin = new boolean[sc.nextInt()][sc.nextInt()];
        sc.nextLine();
        for (int fila = 0; fila < jardin.length; fila++) {
            String filaJardin= sc.nextLine();
            for (int columna = 0; columna < jardin[fila].length; columna++) {
                jardin[fila][columna] = filaJardin.charAt(columna) == '#';
            }
        }

        int cortaCesped = 0;

        for (int i = 0; i < jardin.length; i++) {
            for (int j = 0; j < jardin[i].length; j++) {
                if(jardin[i][j]){
                    jardin[i][j] = false;
                    cortaCesped++;
                    comprobarZona(jardin,i,j);
                }
            }

        }
        System.out.println(cortaCesped);
    }

    public static void comprobarZona(boolean[][] jardin,int fila, int columna){
        if(fila-1>=0){
            if(jardin[fila-1][columna]){
                jardin[fila-1][columna] = false;
                comprobarZona(jardin, fila-1,columna);
            }
        }
        if(fila+1<jardin.length){
            if(jardin[fila+1][columna]){
                jardin[fila+1][columna] = false;
                comprobarZona(jardin, fila+1,columna);
            }
        }

        if(columna+1<jardin[fila].length){
            if(jardin[fila][columna+1]){
                jardin[fila][columna+1] = false;
                comprobarZona(jardin, fila,columna+1);
            }
        }
        if(columna-1>=0){
            if(jardin[fila][columna-1]){
                jardin[fila][columna-1] = false;
                comprobarZona(jardin, fila,columna-1);
            }
        }
    }
}
