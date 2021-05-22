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
        int index;
        
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("1 - Incluir paciente, 2 - Atender paciente, 3 - Mostrar fila, 4 - Sair");
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
                System.out.println("Qual paciente será atendido? ");
                index = Integer.parseInt(sc.nextLine()) - 1;
                pacientes = removerPaciente(pacientes, index);
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
        System.out.println("Número máximo de pesssoas na fila");
        return pacientes;
    }

    public static String[][] removerPaciente(String[][] pacientes, int index) {
        String[][] pacientesAtualizados = new String[pacientes.length][3];
        int cont = 0;
        if (index > pacientes.length || index < 0) {
            System.out.println("Paciente não encontrado");
            return pacientes;
        }
        for (int i = 0; i < pacientes.length; i++) {
            if (i == index) {
                cont++;
                continue;
            }
            pacientesAtualizados[i - cont] = pacientes[i];
        }
        System.out.println("O paciente " + (index + 1) + " foi atendido");
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


