package avaliacao;

import java.util.Scanner;

public class l {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double t, i, total = 0;
		int c = 0;
		System.out.println("Qual o custo para o teatro: ");
		t = sc.nextDouble();
		System.out.println("Qual o preco do ingresso: ");
		i = sc.nextDouble();
		sc.close();
		do {
			total += i;
			c++;
		}while(t > total);
		System.out.println("Total de ingresso: " + c);
	}
}
