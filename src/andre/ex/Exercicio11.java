package andre.ex;

import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        double[][][] matriz = new double[5][5][5];
        aValor(matriz, 0, 0, 0, 0);
        numeroA(matriz, 0, 0, 0, 0);
    }
    public static double[][][] aValor(double[][][] matriz, int a, int b, int c, int cont){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o " + (cont+1) + "º numero: ");
        matriz[a][b][c] = in.nextDouble();
         c++; 
         cont++;
        if (c == 5){
         b++;                
         c= 0;
        }        
        if (b == 5) {
	a++;   b = 0;
	}
        if (a > 4) return matriz; 
        return aValor(matriz, a, b, c, cont);
    }
    public static void numeroA(double[][][] matriz, int a,int b, int c, int cont){
        System.out.println("Numero " + (cont+1) + "º : " + matriz[a][b][c]);
        c++; 
        cont++;
        if (c == 5){
         b++; 
         c = 0;
        }
        if (b == 5) {
         a++; 
         c = 0;
}
        if (a < 5) numeroA(matriz, a, b, c, cont);
    }
}