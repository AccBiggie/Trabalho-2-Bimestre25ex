package andre.ex;
import java.util.Scanner;
public class Exercicio04 {
   
    public static void main(String[] args) {
      int[] vetor = new int[10];
       pickVall(vetor, 0);
       int smallVal = vetor[9];
       System.out.println("O menor valor foi: " + pickSmallVal(vetor, 0, smallVal));
    }
   static int pickSmallVal(int[] vetor, int i, int value) {
    	if (vetor[i] < value) value = vetor[i];
    	i++;
    	if(i < 10) return pickSmallVal(vetor, i, value);
	return value;
    }

    static void pickVall(int[] vetor, int b){
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite um " + (b+1) + "° numero: ");
        vetor[b] = in.nextInt();
        b++;   
        if (b < 10) pickVall(vetor, b);
    }
}