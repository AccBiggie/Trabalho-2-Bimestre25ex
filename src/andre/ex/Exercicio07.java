package andre.ex;
public class Exercicio07 {

    public static void main(String[] args) {
    System.out.println("Resultado de todos os numeros impares de 1 a 100: ");
        imprimaImpar();       
    }
    public static Integer b = 1;			
	public  static void imprimaImpar() {
        System.out.println(b); 
        b += 2;
        if (100>=b) imprimaImpar();
    }
}
