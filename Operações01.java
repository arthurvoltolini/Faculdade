package facul;

import java.util.Scanner;

public class Opera��es01{

	public static void main(String[] args) {
  		//Declara��o das vari�veis.
  		double N1; 
  		double N2;
  		double soma;
  		double subtracao;
  		double divisao;
  		
	  	//Entradas de dados
  		Scanner teclado = new Scanner(System.in);
  		
  		System.out.println("Digite o numero 1:");
	  	N1 = teclado.nextInt();	  	
	  	
	  	System.out.println("Digite o numero 2:");	  	
	  	N2 = teclado.nextInt();
	  		
		//Processamento
	  	soma = N1 + N2;
	  	subtracao = N1 - N2;
	  	divisao = (double) N1 / N2;
	  	
	  	//Sa�da
 		System.out.println("A soma �:" + soma);
 		System.out.println("A subtracao �:" + subtracao);
 		System.out.println("A multiplica��o �:" + N1 * N2);
 		System.out.println("A divis�o �:" + N1 / N2);
 		
 		teclado.close();

	}

}
