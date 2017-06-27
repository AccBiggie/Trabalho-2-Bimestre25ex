package andre.ex;
import java.util.Scanner;
public class Exercicio16 {
	public static void main(String[] args) {
	    String[] nome = new String[10];
	    nomeAluno(nome, 0);  imprime(nome, 0);
	}
	static void nomeAluno(String[] Nome, Integer x1){
            Scanner in = new Scanner(System.in);
            System.out.println("Digite o nome do " +(x1 + 1) + "º aluno: ");
	    Nome[x1] = in.nextLine(); x1++;
            if(x1 < 10){
	    nomeAluno(Nome, x1);
    
        } 
        }
	static void imprime(String[] Nome, Integer x1){
            System.out.println("Nome do " +(x1 + 1) +"º aluno: "+Nome[x1]); x1++;
	     if(x1 < 10){
		imprime(Nome, x1);
    }
  }

}