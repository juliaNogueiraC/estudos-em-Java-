import java.util.Scanner;
 
public class Main {
 
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       double valor_real ,valor_convertido;
       final double valor_dolar = 4.00
       
       System.out.println("digite o valor em reais:");
       valor_real = in.nextDouble();
        
        valor_convertido = valor_dolar *valor_real;
        System.out.println("o valor convertido de real para dolar é"+valor_convertido);
       
       }
       }
       
        