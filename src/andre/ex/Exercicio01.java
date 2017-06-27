package andre.ex;

public class Exercicio01 {
	public static void main(String[] args) {
		Integer count = 0;	
		AlgoritmoImprime (count);
    }
			public static void AlgoritmoImprime (Integer count){
				if (count < 100) {
				  System.out.print("," + count); 
                                    count++; 
                                    AlgoritmoImprime (count);
					}else {
					System.out.print("," + count);
		}
		
	}
}