package FilaEPilha;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {
		/*  Nome, idade, descrição
		 	1 - Incluir Paciente;
			2 - Atender Paciente;
			3 - Sair
			20 pacientes
			Remover da fila
			Reorganizar a fila
		 */
		
        String[][] pacientes = new String[20][3];
        String nome, idade, descricao;
        int ind;
        
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 4) {
            System.out.println(""
            		+ "1 - Incluir paciente, "
            		+ "2 - Atender paciente, "
            		+ "3 - Mostrar fila, "
            		+ "4 - Sair");
            opcao = Integer.parseInt(sc.nextLine());
            
            if (opcao == 1) {
                System.out.println("Nome: ");
                nome = sc.nextLine();
                System.out.println("Idade: ");
                idade = sc.nextLine();
                System.out.println("Descrição: ");
                descricao = sc.nextLine();
                pacientes = adicionarPaciente(pacientes, nome, idade, descricao);
                
            } else if (opcao == 2) {
                System.out.println("Qual o nome do paciente que será atendido? ");
                ind = Integer.parseInt(sc.nextLine()) - 1;
                pacientes = removerPaciente(pacientes, ind);
                
            } else if (opcao == 3) {
                mostrarFila(pacientes);
            } else if (opcao < 1 || opcao > 4){
                System.out.println("Opção inválida");
            }
        }
    }

    public static String[][] adicionarPaciente(String[][] pacientes, String nome, String idade, String descricao) {
        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i][0] == null) {
                pacientes[i][0] = nome;
                pacientes[i][1] = idade;
                pacientes[i][2] = descricao;
                return pacientes;
            }
        }
        System.out.println("A fila atingiu o número máximo de pesssoas");
        return pacientes;
    }

    public static String[][] removerPaciente(String[][] pacientes, int ind) {
        String[][] pacientesAtualizados = new String[pacientes.length][3];
        int cont = 0;
        if (ind > pacientes.length || ind < 0) {
            System.out.println("Paciente não encontrado");
            return pacientes;
        }
        for (int i = 0; i < pacientes.length; i++) {
            if (i == ind) {
                cont++;
                continue;
            }
            pacientesAtualizados[i - cont] = pacientes[i];
        }
        System.out.println("O paciente " + (ind + 1) + " foi atendido");
        return pacientesAtualizados;
    }

    public static void mostrarFila(String[][] pacientes) {
        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i][0] == null) {
                continue;
            }
            System.out.println("Paciente " + (i + 1) + " - Nome: " + pacientes[i][0] + ", Idade: " + pacientes[i][1]);
        }
    }
}


