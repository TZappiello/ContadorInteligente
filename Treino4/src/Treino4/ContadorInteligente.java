package Treino4;

import java.util.Scanner;

public class ContadorInteligente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		System.out.print("Digite o 1º valor: ");
		int num1 = sc.nextInt();
		System.out.print("Digite o 2º valor: ");
		int num2 = sc.nextInt();
		
		if (num1 < num2) {
			cont = num1;
			while (cont <= num2) {
				System.out.println(cont + ".");
				cont++;
			}

		} else {
			cont = num1;
			while (cont >= num2) {
				System.out.println(cont + ".");
				cont--;
			}
		}
		sc.close();
	}

}
