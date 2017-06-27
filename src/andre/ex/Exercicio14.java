package andre.ex;

import java.util.Scanner;
public class Exercicio14 {
     public static void main(String[] args) {
        double falta = 0; double n = mediaFalta(falta, 0);
                System.out.println("A media de falta e de: " + n/10);
    }
         public static double mediaFalta(double falta, int contador){
                Scanner in = new Scanner(System.in);
                System.out.println("Informe as faltas do " + (contador+1) + "º estudante: ");
                falta += in.nextInt();
                    contador ++;       
            if (contador == 10){
             return falta;
            }else{
                    return mediaFalta(falta, contador);
    }

  }
}