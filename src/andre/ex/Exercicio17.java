package andre.ex;
import java.util.Scanner;
public class Exercicio17 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
	Integer n1 = 0, n2 = 0;	
	System.out.println("Insira um numero multiplicador:");  n1 = entrada.nextInt();
	System.out.println("Insira um numero multiplicador:");  n2 = entrada.nextInt();
	System.out.print(n1 + "x"+n2 + "="); printMultiplicador(n1,n2);
	System.out.print(":" + (n1*n2));
	}
    public static String printMultiplicador(Integer n2, Integer n) {
	    if(n == 0) return "0";		
	    if(n > 1) System.out.print(n2+ "+");
	    if(n == 1) System.out.print(n2);  n--;
		return printMultiplicador(n2, n);
	}
}
    