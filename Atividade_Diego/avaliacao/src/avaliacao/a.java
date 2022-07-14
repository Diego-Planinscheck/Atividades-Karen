package avaliacao;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.println("Digite um numero: ");
		a = sc.nextInt();
		System.out.println("Digite um numero: ");
		b = sc.nextInt();
		
		System.out.println("O resultado é: " + (a - b));
		sc.close();
	}

}
