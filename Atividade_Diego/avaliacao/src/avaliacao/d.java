package avaliacao;

import java.util.Scanner;

public class d {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double preco;
		
		System.out.println("Qual o preco do produto: ");
		preco = sc.nextDouble();
		
		double desconto = preco * 0.01;
		
		System.out.println("O novo preco do produto é: " + (preco - desconto));
		sc.close();
	}
}
