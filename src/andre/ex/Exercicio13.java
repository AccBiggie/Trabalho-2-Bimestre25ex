package andre.ex;
import java.util.Scanner;
public class Exercicio13 {
        public static void main(String[] args) {
            double notas = 0; double n = mediaNota(notas, 0);
                System.out.println("A media de notas e de: " + n/10);
        
    }
         public static double mediaNota(double notas, int contador){
                Scanner in = new Scanner(System.in);
                System.out.println("Informe as notas  " + (contador+1) + "º estudante: ");
                notas += in.nextInt();
                    contador ++;
        
            if (contador == 10){
             return notas;
            }else{
                    return mediaNota(notas, contador);
    }

  }
}
