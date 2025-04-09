import java.util.ArrayList;
import java.util.Scanner;

public class numeroHashard {

    /*
2000 2100
1 10
2011 2015
1000 2000
0 0
     */
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero1=sc.nextInt();
        int numero2=sc.nextInt();
        sc.nextLine();
        while(numero1!=0 && numero2!=0){

            ArrayList<Integer> numerosHashard = new ArrayList<>();
            while(numero1<=numero2){
                String num = String.valueOf(numero1);
                int sumaCifras =0;
                for (int i = 0; i < num.length(); i++) {

                    sumaCifras += Integer.parseInt(String.valueOf(num.charAt(i)));
                }

                if(numero1%sumaCifras==0) numerosHashard.addLast(numero1);
                numero1++;
            }

            ArrayList<Integer> cadenaNumeros = new ArrayList<>();
            for(int numero: numerosHashard){
                int sumador =0;
                ArrayList<Integer> cadena = new ArrayList<>();
                while(numerosHashard.contains(numero+sumador)){
                    cadena.addLast(numero+sumador);

                    sumador++;
                }

                if(cadenaNumeros.size()<cadena.size())cadenaNumeros = cadena;
            }

            if(cadenaNumeros.isEmpty()) System.out.print("NO HAY NINGUNO");
            for(int numero: cadenaNumeros){
                System.out.printf("%d ",numero);
            }
            System.out.print("\r\n");

            numero1 = sc.nextInt();
            numero2 = sc.nextInt();
            sc.nextLine();
        }
    }
}
