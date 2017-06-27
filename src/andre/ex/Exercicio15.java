package andre.ex;

import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        Integer idade = 0; Integer n = pessoaIdosa(idade, 0);
                System.out.println("A media de idade e de: " + n/10);
   }
         public static int pessoaIdosa(Integer idade, Integer contador){
                Scanner in = new Scanner(System.in);
                System.out.println("Informe a idade da " + (contador+1) + "º pessoa: ");
                idade += in.nextInt();
                    contador ++;
                if (contador == 10){
             return idade;
            }else{
                    return pessoaIdosa(idade, contador);
    }

  }

}