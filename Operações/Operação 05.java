package facul;

import java.util.Scanner;

public class Operações5 {

	public static void main(String[] args) {
		
	  		//Declaração das variáveis.
	  		int base; 
	  		int altura;
	  		int area;
	  		
		  	//Entradas de dados
	  		Scanner teclado = new Scanner(System.in);
	  		
	  		System.out.println("Base:");
	  		base = teclado.nextInt();

	  		System.out.println("Altura:");
	  		altura = teclado.nextInt();

	  		area = base * altura / 2;
	  		
		  	//Processamento e Saída
	 		System.out.println("Area:" + area);
	 		
	 		teclado.close();

	}

}
