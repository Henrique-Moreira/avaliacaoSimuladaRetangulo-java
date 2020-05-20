package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, altura;
		int option;
		
		System.out.print("Digite a largura do retângulo: ");
		largura = sc.nextDouble();
		
		while (largura <= 0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			largura = sc.nextDouble();
		}
		
		
		System.out.print("Digite a altura do retângulo: ");
		altura = sc.nextDouble();
		System.out.println();
		
		while (altura <= 0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			altura = sc.nextDouble();
			System.out.println();
		}

		System.out.println("MENU:");
		System.out.println();
		System.out.println("1-Mostrar area");
		System.out.println("2-Mostrar perimetro");
		System.out.println("3-Sair");
		System.out.print("Digite uma opcao: ");
		option = sc.nextInt();
		
		while(option != 1 && option != 2 && option != 3) {
			System.out.println();
			System.out.println("OPÇÃO INVALIDA");
			System.out.println();
			System.out.println("MENU:");
			System.out.println();
			System.out.println("1-Mostrar area");
			System.out.println("2-Mostrar perimetro");
			System.out.println("3-Sair");
			System.out.print("Digite uma opcao: ");
			option = sc.nextInt();
		}
		while(option == 1 || option == 2) {
		if (option == 1) {
			System.out.println();
			System.out.println("AREA = " + (altura*largura));
			System.out.println();
			System.out.println("MENU:");
			System.out.println();
			System.out.println("1-Mostrar area");
			System.out.println("2-Mostrar perimetro");
			System.out.println("3-Sair");
			System.out.print("Digite uma opcao: ");
			option = sc.nextInt();
			
			while(option != 1 && option != 2 && option != 3) {
				System.out.println();
				System.out.println("OPÇÃO INVALIDA");
				System.out.println();
				System.out.println("MENU:");
				System.out.println();
				System.out.println("1-Mostrar area");
				System.out.println("2-Mostrar perimetro");
				System.out.println("3-Sair");
				System.out.print("Digite uma opcao: ");
				option = sc.nextInt();
			}
		}
		else if (option == 2) {
			System.out.println();
			System.out.println("PERÍMETRO = " + (largura+largura+altura+altura));

			System.out.println();
			System.out.println("MENU:");
			System.out.println();
			System.out.println("1-Mostrar area");
			System.out.println("2-Mostrar perimetro");
			System.out.println("3-Sair");
			System.out.print("Digite uma opcao: ");
			option = sc.nextInt();
			
			while(option != 1 && option != 2 && option != 3) {
				System.out.println();
				System.out.println("OPÇÃO INVALIDA");
				System.out.println();
				System.out.println("MENU:");
				System.out.println();
				System.out.println("1-Mostrar area");
				System.out.println("2-Mostrar perimetro");
				System.out.println("3-Sair");
				System.out.print("Digite uma opcao: ");
				option = sc.nextInt();
			}
			}
		
		}
		System.out.println();
		System.out.println("FIM DO PROGRAMA!");
		
		sc.close();
	}

}
