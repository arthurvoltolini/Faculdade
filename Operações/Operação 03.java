package facul;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Operações03 {

	public static void main(String[] args) {

  		//Declaração das variáveis.
  		int anoNascimento; 
  		int anoAtual;
  		
	  	//Entradas de dados
  		Scanner teclado = new Scanner(System.in);
  		
  		System.out.println("Digite seu ano de Nascimento:");
  		anoNascimento = teclado.nextInt();
  		
  		//Date data = new Date();
  		//anoAtual = data.getYear();
  		//String ano = new SimpleDateFormat("yyyy").format(data);
  		//anoAtual = ano.parseInt();
  		//anoAtual = now().getYear();
  		
  		LocalDateTime data1 = LocalDateTime.now();
  		anoAtual = data1.getYear();
  		
	  	//Processamento e Saída
 		System.out.println("Idade:" + (anoAtual-anoNascimento));
 		
 		teclado.close();

	}

}
