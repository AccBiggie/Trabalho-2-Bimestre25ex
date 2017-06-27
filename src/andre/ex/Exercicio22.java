package andre.ex;
import java.util.Scanner;
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);		
        System.out.println("Informe uma posição: ");
        long fibo = (long) entrada.nextDouble();
	System.out.println(fibonacci(fibo));

	}
    public static Integer fibonacci(long x){
	 if(x <= 1){
	 return 1;
	 }else{
	 return fibonacci(x -1) + fibonacci(x -2);
		}
	}
}