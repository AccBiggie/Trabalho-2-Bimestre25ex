package andre.ex;

import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
            double[][] matriz = new double [5][5];
            valaSalvar(matriz, 0, 0, 0); impressaoDeValores(matriz,0, 0, 0);
    }
    static double[][] valaSalvar(double[][] matriz, Integer a, Integer b, Integer cont){
            Scanner in = new Scanner(System.in);
            System.out.println("Informe um "  + (cont+1)+ "° numero: ");
            matriz[a][b] = in.nextDouble();
            b++; cont++;
       if (b == 5){
            a++; b = 0;
    }
       if (a > 4) return matriz; return valaSalvar(matriz, a, b, cont);
    }
        static void impressaoDeValores(double [][] matriz, Integer a, Integer b, Integer cont){
            System.out.println("Numero " + (cont+1) + matriz[a][b]);
            b++; cont++;
            if (b==5){
            a++; b = 0;
    }
        if (a < 5) impressaoDeValores(matriz, a, b, cont);
  }
}