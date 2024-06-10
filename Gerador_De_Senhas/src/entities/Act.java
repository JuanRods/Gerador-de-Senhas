package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Act {
	static Scanner scanner = new Scanner(System.in);
	public static void exibirMenu() {
		System.out.println("╔══════════════════════════════════════╗");
		System.out.println("║          MENU PRINCIPAL              ║");
		System.out.println("╠══════════════════════════════════════╣");
		System.out.println("║ 1. Gerar e adicionar uma nova senha  ║");
		System.out.println("║ 2. Vizualizar lista de registros     ║");
		System.out.println("║ 3. Exibir todas senhas               ║");
		System.out.println("║ 4. Sair                              ║");
		System.out.println("╚══════════════════════════════════════╝");
		System.out.print("Escolha uma opção: ");
	}

	public static void register(ArrayList<Senha> registros) {
			String categoria = null;
			
			System.out.println("╔══════════════════════════════════════╗");
			System.out.println("║          Escolha uma categoria:      ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║1. Emails                             ║");
			System.out.println("║2. Redes Sociais                      ║");
			System.out.println("║3. Serviços de Streaming              ║");
			System.out.println("║4. E-commerce                         ║");
			System.out.println("║5. Bancos e Finanças                  ║");
			System.out.println("║6. Trabalho                           ║");
			System.out.println("║7. Educação                           ║");
			System.out.println("║8. Entretenimento                     ║");
			System.out.println("║9. Utilitários e Serviços             ║");
			System.out.println("║10. Outros                            ║");
			System.out.println("╚══════════════════════════════════════╝");
			System.out.print("Digite o número da categoria: ");
			int categoryChoice = scanner.nextInt();
			scanner.nextLine(); // Consumir a nova linha

			switch (categoryChoice) {
			case 1:
				System.out.println("Informe o email:");
				categoria = scanner.nextLine();
				break;
			case 2:
				System.out.println("Informe a Rede Social:");
				categoria = scanner.nextLine();
				break;
			case 3:
				System.out.println("Insira o Streaming");
				categoria = scanner.nextLine();
				break;
			case 4:
				System.out.println("Insira o E-commerce");
				categoria = scanner.nextLine();
				break;
			case 5:
				System.out.println("Insira o Banco");
				categoria = scanner.nextLine();
				break;
			case 6:
				categoria = "Trabalho";
				break;
			case 7:
				categoria = "Educação";
				break;
			case 8:
				categoria = "Entretenimento";
				break;
			case 9:
				categoria= "Utilitários e Serviços";
				break;
			case 10:
				System.out.println("Insira o nome:");
				categoria = scanner.nextLine();
				break;
			default:
				System.out.println("Categoria inválida. Tente novamente.");

			}

			boolean validLength = false;
			int length = 0;
			while (!validLength) {
				System.out.print("\nDigite o comprimento desejado da senha (mínimo 8): ");
				length = scanner.nextInt();
				scanner.nextLine(); // Consumir a nova linha
				if (length >= 8) {
					validLength = true;
				}

			}

			try {

				String senha = PasswordGenerator.limit(length);
				System.out.println("\nSenha gerada: " + senha);

				Senha senhas = new Senha(categoria, senha);
				registros.add(senhas);

				System.out.println("\nSenha gerada e adicionada com sucesso!");

			} catch (IllegalArgumentException e) {
				System.out.println("\nErro: " + e.getMessage());

			}

		

		
	}
	public static void printList(ArrayList<Senha> registros) {
		// Utiliza o método toString de cada classe para impressão de seus atributos
		System.out.println("\nRegistros:");
		for (Senha registro : registros) {
			System.out.println(registro.toString());
		}
	}
	
}
