package facul;

import java.util.Scanner;

public class Operações01{

	public static void main(String[] args) {
  		//Declaração das variáveis.
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
	  	
	  	//Saída
 		System.out.println("A soma é:" + soma);
 		System.out.println("A subtracao é:" + subtracao);
 		System.out.println("A multiplicação é:" + N1 * N2);
 		System.out.println("A divisão é:" + N1 / N2);
 		
 		teclado.close();

	}

}
