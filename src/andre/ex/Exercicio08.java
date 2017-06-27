package andre.ex;

public class Exercicio08 {
    public static void main(String[] args) {
        System.out.println("Resultado de todos os numeros pares de 100 até 0: ");
        imprimaPar();       
    }
    public static Integer b = 100;			
	public  static void imprimaPar() {
        System.out.println(b); 
        b -= 2;
        if (b >=2) imprimaPar();
      }
}
