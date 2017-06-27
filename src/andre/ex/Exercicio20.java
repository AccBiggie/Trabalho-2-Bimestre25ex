package andre.ex;
import java.util.Scanner;
public class Exercicio20 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        Integer num = entrada.nextInt(); Integer resultado = fat(num);
        System.out.println("Resultado: " + resultado);        
   }

   public static Integer fat(Integer num){
        if (num < 2) return 1;

      else return num * fat(num - 1);
   }
}
