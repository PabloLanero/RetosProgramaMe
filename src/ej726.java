import java.util.ArrayList;
import java.util.Scanner;

//Preguntar por que la salida debe salir asi, problemas con la comprension del ejercicio

public class ej726{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int canales = sc.nextInt();
        int personas = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> canalesPreferidos = new ArrayList<>(0);
        ArrayList<Integer> canalesProhibidos = new ArrayList<>(0);
        for (int i = 0; i < personas; i++) {
            int canalPreferido = sc.nextInt();
            int canalProhibido = sc.nextInt();
            sc.nextLine();
            if (!canalesPreferidos.contains(canalPreferido))canalesPreferidos.add(canalPreferido);
            if (!canalesProhibidos.contains(canalProhibido))canalesProhibidos.add(canalProhibido);

        }


        int canalesEnPaz = canales - canalesProhibidos.size();
        int canalesBloqueados = 0;
        for( int canal : canalesProhibidos){
            if(canalesPreferidos.contains(canal)){
                canalesBloqueados++;
                canales--;
            }
        }
        System.out.println(canales + " "+ canalesBloqueados );
    }
}

/*
 * Le he preguntado a Claude a ver que tal iba, y me ha generado esto, queda pendiente testearlo

 import java.util.*;

public class CampanadasTelevisadas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            int N = scanner.nextInt(); // Número de canales
            int M = scanner.nextInt(); // Número de personas
            
            int[] favoritos = new int[M];
            int[] detestados = new int[M];
            
            // Leer preferencias de cada persona
            for (int i = 0; i < M; i++) {
                favoritos[i] = scanner.nextInt();
                detestados[i] = scanner.nextInt();
            }
            
            // Procesar cada posible canal inicial
            int estables = 0;    // Canales que llevan a una solución estable
            int ciclos = 0;      // Canales que llevan a un ciclo
            int indeterminados = 0; // Canales con resultado indeterminado
            
            for (int canalInicial = 1; canalInicial <= N; canalInicial++) {
                int resultado = analizarCanal(canalInicial, N, M, favoritos, detestados);
                if (resultado == 0) estables++;
                else if (resultado == 1) ciclos++;
                else indeterminados++;
            }
            
            System.out.println(estables + " " + ciclos + " " + indeterminados);
        }
        
        scanner.close();
    }
    
    // Retorna 0 si el canal lleva a solución estable, 1 si lleva a ciclo, 2 si es indeterminado
    private static int analizarCanal(int canalInicial, int N, int M, int[] favoritos, int[] detestados) {
        // Verificar si el canal inicial es estable (nadie lo detesta)
        boolean esEstable = true;
        for (int i = 0; i < M; i++) {
            if (detestados[i] == canalInicial) {
                esEstable = false;
                break;
            }
        }
        
        if (esEstable) return 0; // Canal estable
        
        // Construir grafo de transiciones
        List<Integer>[] transiciones = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            transiciones[i] = new ArrayList<>();
        }
        
        // Para cada canal, determinar quiénes lo detestan y a qué canal cambiarían
        for (int canal = 1; canal <= N; canal++) {
            for (int persona = 0; persona < M; persona++) {
                if (detestados[persona] == canal) {
                    transiciones[canal].add(favoritos[persona]);
                }
            }
        }
        
        // Si hay múltiples personas que detestan un canal, es indeterminado
        for (int i = 1; i <= N; i++) {
            if (transiciones[i].size() > 1) {
                // Verificamos si el canal inicial puede llegar a este canal indeterminado
                if (puedeAlcanzar(canalInicial, i, transiciones, new boolean[N + 1])) {
                    return 2; // Indeterminado
                }
            }
        }
        
        // Detectar ciclos mediante DFS
        Set<Integer> visitados = new HashSet<>();
        Set<Integer> enProceso = new HashSet<>();
        if (detectarCiclo(canalInicial, visitados, enProceso, transiciones)) {
            return 1; // Hay ciclo
        }
        
        return 0; // Si no hay ciclos ni indeterminados, es estable
    }
    
    private static boolean puedeAlcanzar(int origen, int destino, List<Integer>[] transiciones, boolean[] visitados) {
        if (origen == destino) return true;
        if (visitados[origen]) return false;
        
        visitados[origen] = true;
        
        for (int siguiente : transiciones[origen]) {
            if (puedeAlcanzar(siguiente, destino, transiciones, visitados)) {
                return true;
            }
        }
        
        return false;
    }
    
    private static boolean detectarCiclo(int nodo, Set<Integer> visitados, Set<Integer> enProceso, 
                                          List<Integer>[] transiciones) {
        visitados.add(nodo);
        enProceso.add(nodo);
        
        for (int vecino : transiciones[nodo]) {
            if (!visitados.contains(vecino)) {
                if (detectarCiclo(vecino, visitados, enProceso, transiciones)) {
                    return true;
                }
            } else if (enProceso.contains(vecino)) {
                return true; // Encontramos un ciclo
            }
        }
        
        enProceso.remove(nodo);
        return false;
    }
}
 * 
 * 
 * 
 */