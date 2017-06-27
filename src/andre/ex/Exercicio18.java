package andre.ex;
import java.util.Scanner;
public class Exercicio18 {

    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);		
	System.out.println("Digire o valor: ");
	Integer valor = entrada.nextInt();		
	System.out.println("Digite a % de emprestimo : ");
	Integer juros = entrada.nextInt();		
	System.out.println("Qual é o tempo de simulação? : ");
	int tempo = entrada.nextInt(); printJuros(valor, juros, tempo, 1);	
 }
      public static void printJuros(Integer valor, Integer juros, Integer tempo, Integer n) {
	if(n <= tempo){
	if (n > 1) {
	System.out.println( n + " meses = " + valor * (juros/100) * n);	
	}else{
	System.out.println( n + " mes = " + valor * (juros/100) * n);	
 }
}
        n++;
		
	if (n <= tempo) printJuros(valor, juros, tempo, n);
	}
    }

