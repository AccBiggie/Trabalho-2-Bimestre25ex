package andre.ex;

public class Exercicio09 {
    public static void main(String[] args) {
        System.out.println("Resultado de todos os numeros impares de 100 a 0: ");
        imprimaImpar();       
    }
    public static Integer b = 99;			
	public  static void imprimaImpar() {
        System.out.println(b); 
        b -= 2;
        if (b >=0 ) imprimaImpar();
    }
}
