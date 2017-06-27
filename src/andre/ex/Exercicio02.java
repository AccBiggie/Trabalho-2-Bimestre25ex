package andre.ex;

public class Exercicio02 {
	
    public static void main(String[] args) {
        Integer count = 100;	
        AlgoritmoImprime (count);
    }	
    public static void AlgoritmoImprime (Integer count){		
        if (count > 0) {
            System.out.print( ","+ count); 
            count--;
            AlgoritmoImprime (count);
		}else {
                    System.out.print("," + count); 
		}
		
	}
}