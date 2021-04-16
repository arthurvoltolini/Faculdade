package Projeto;

public class Salarioa {

	public static void main(String[] args) {
		
		double sal = 1000;
		double aumentopercent = 0.015;
		
		for(int ano = 2015; ano < 2022;ano=ano+1) {
			System.out.println ("O salario do colaborador no ano de " + ano + "é de:R$" + sal);
			sal = sal+(sal*aumentopercent);
			aumentopercent=aumentopercent*2;
			
		}

	}

}
