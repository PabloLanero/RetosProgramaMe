import java.math.BigInteger;

//Pendiente de preguntar para ver si el profe nos puede decir como gestionar numeros que excedan el limite de int
public class ej138{
    public static void main(String[] args) {
        BigInteger numero =  new BigInteger("100");
        BigInteger resultado =  new BigInteger("1");
        while(!numero.equals(1)){
            resultado.multiply(numero);
            

        }
        System.out.println(resultado);

    }
    
}
