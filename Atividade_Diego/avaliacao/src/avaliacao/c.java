package avaliacao;

import java.util.Scanner;

public class c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Escreva um numero: ");
		a = sc.nextInt();
		while(a == 0) {
			System.out.println("O primeiro numero nao pode ser zero: ");
			System.out.println("Digite o primeiro numero novamente: ");
			a = sc.nextInt();
		}
		System.out.println("Escreva um numero: ");
		b = sc.nextInt();
		System.out.println("Divisão: " + (a/b));
		sc.close();
	}
}
