package andre.ex;

import java.util.Scanner;
public class Exercicio19 {
   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        String alfa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Digite as letras para combinação: ");
        Integer tamanhoL = entrada.nextInt(); alfa = alfa.substring(0, tamanhoL);
        c("", alfa);
    }
    public static void c(String aux, String alfa) {
       if (alfa.length() <= 1) System.out.println(aux + alfa);
       if (alfa.length() > 1){
            for (Integer i = 0; i < alfa.length(); i++) {
                String n1 = alfa.substring(i, i + 1);
                 String n2 = alfa.substring(0, i);
                  String n3 = alfa.substring(i + 1);
                c(aux + n1, n2 + n3);
            }
        }
    }
}