package andre.ex;
import java.util.Scanner;
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);			
	System.out.println("Digite numero triangular: ");
        Integer j = entrada.nextInt();
        triangulo(j, 1, 2);
	}
	
    static void  triangulo(Integer j, Integer n, Integer m){
        System.out.print(n +", ");
	if(j > 1){
        triangulo(j -1, n += m, m++);
   }
  }
}