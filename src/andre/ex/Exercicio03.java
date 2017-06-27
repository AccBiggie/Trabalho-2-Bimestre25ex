package andre.ex;

	import java.util.Scanner;
	 

    public class Exercicio03 {
        
        public static void main(String[] args) {
            int [] vetor = new int[10];           
            int soma = Array(vetor, 0, 0);
            System.out.println(" Soma é :" + soma);          
    }
    public static int Array(int[] vetor,  int contador, int soma){ 
        Scanner in = new Scanner(System.in);
        if (contador == 10) return soma;
        System.out.println(" Digite um " + (contador + 1)+ "° numero:"); 

        vetor[contador] = in.nextInt();
        soma+= vetor[contador];
        return Array(vetor, ++contador, soma);
    }
    }
    
    
 


