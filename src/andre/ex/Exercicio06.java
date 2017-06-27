package andre.ex;
public class Exercicio06 {
	   public static void main(String[] args) {
	        System.out.println("Resultado de todos os numeros pares de 0 a 100: ");
	        imprimaPar();       
	    }
	    public static Integer b = 0;			
		public  static void imprimaPar() {
	        System.out.println(b); 
	        b += 2;
	        if (100>=b) imprimaPar();
	      }
	}