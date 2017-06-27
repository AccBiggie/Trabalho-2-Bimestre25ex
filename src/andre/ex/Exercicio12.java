package andre.ex;
import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um numero para tabuada: ");
        Integer numeroT = in.nextInt(); 
        numeroTabuada(numeroT,0);
	}
	
    public static void numeroTabuada(Integer numeroT, Integer count) {
        System.out.println(numeroT + " x " + count+ " = " + (numeroT * count));
        count++;
	if (count<= 10) numeroTabuada(numeroT, count);
	}
}

