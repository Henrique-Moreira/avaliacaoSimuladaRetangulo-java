package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, altura;
		
		System.out.print("Digite a largura do ret�ngulo: ");
		largura = sc.nextDouble();
		
		while (largura < 0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			largura = sc.nextDouble();
		}
		
		
		
		sc.close();
	}

}