package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Act;
import entities.Senha;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Senha> registros = new ArrayList<>();
		while (true) {
			System.out.println("╔══════════════════════════════════════╗");
			System.out.println("║          MENU PRINCIPAL              ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║ 1. Gerar e adicionar uma nova senha  ║");
			System.out.println("║ 2. Exibir todas senhas               ║");
			System.out.println("║ 3. Sair                              ║");
			System.out.println("╚══════════════════════════════════════╝");
			System.out.print("Escolha uma opção: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consumir a nova linha

			switch (choice) {
			case 1:
				Act.register(registros);
				break;
			case 2:
				System.out.println("\nSenhas armazenadas:");
				Act.printList(registros);
				break;

			case 3:
				System.out.println("Saindo...");
				scanner.close();
				return;

			default:
				System.out.println("\nOpção inválida. Tente novamente.");
			}
		}
	}

}
