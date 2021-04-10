package faculdade;

import java.util.Scanner;

public class Imposto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char escolher = 'N';
		int opcao;
		
		do {
			
			//Escolha da op��o no menu 
			System.out.println("---------Menu---------");
			System.out.println("----------------------");
			System.out.println("1. Imposto\n"
							 + "2. Novo sal�rio\n"
							 + "3. Classifica��o\n"
							 + "4. Sair");
			System.out.println("----------------------");
			opcao = sc.nextInt();
			
			//Verifica se a op��o � v�lida 
			if(opcao > 4 || opcao < 1) {
				System.out.println("Op��o Inv�lida - informe uma op��o de (1-3)");
				escolher = 'N';
			}else {
	
				//Informa o sal�rio 
				if(opcao == 4) {
					//Finaliza o programa
					escolher = 'S';
					break;
				}else {
					System.out.println("Informe o sal�rio: ");
					double salario = sc.nextDouble();
					
					//Verifica se o sal�rio � v�lido 
					if(salario < 0) {
						System.out.println("Op��o Inv�lida - sal�rio negativo!");
						escolher = 'N';
					}else {
						
						//Verifica��o das op��es do menu 
						switch (opcao) {
						
							//Imposto
							case 1: {
								
								double imposto = 0;
								
								//Verifica��o de imposto - porcentagem 
								if(salario < 500) {
									imposto = 5;
								}else if(salario >= 500 && salario <= 850) {
									imposto = 10;
								}else if(salario > 850) {
									imposto = 15;
								}
								
								//Calculo de valor do imposto
								imposto = (salario*imposto)/100;
							
								//Exibi��o dos resultados 
								System.out.println("----------------------");
								System.out.println("Sal�rio: "+salario);
								System.out.println("Imposto: "+imposto);
								System.out.println("----------------------");
								
								break;
							}
							
							//Novo sal�rio 
							case 2: {
								
								double aumento = 0;
								
								//Verifica��o do aumento do sal�rio
								if(salario > 1500) {
									aumento = 25;
								}else if(salario >= 750 && salario <= 1500) {
									aumento = 50;
								}else if(salario >= 450 && salario <= 750) {
									aumento = 75;
								}else if(salario < 400) {
									aumento = 100;
								}
								
								//Calculo de aumento do sal�rio 
								double novoSalario = salario+aumento;
								
								//Exibi��o dos resultados
								System.out.println("----------------------");
								System.out.println("Sal�rio: "+salario);
								System.out.println("Aumento: "+aumento);
								System.out.println("Novo Sal�rio: "+novoSalario);
								System.out.println("----------------------");
								
								break;
							}
							
							//Classifica��o 
							case 3: {
								
								//Mostra o sal�rio
								System.out.println("----------------------");
								System.out.println("Sal�rio: "+salario);
								
								//Verifica qual a categoria que o sal�rio se encaixa 
								if(salario <= 700) {
									System.out.println("Mal Remunerado");
								}else {
									System.out.println("Bem Remunerado");
								}
								System.out.println("----------------------");
								
								break;
							}
						}	
					}
				}
			}
			
		}while(escolher == 'N');
		
		System.out.println("Finalizado");
		sc.close();
	}
}