package avaliacao;

import java.util.Scanner;

public class n {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double g1, g2, peso;
		
		System.out.println("Peso do saco: ");
		peso = sc.nextDouble();
		System.out.println("Quilos para o gato 1: ");
		g1 = sc.nextDouble();
		System.out.println("Quilos para o gato 2: ");
		g2 = sc.nextDouble();
		
		g1 = g1 * 5;
		g2 = g2 * 5;
		
		if(peso > (g1 + g2)) {
			System.out.println("Restou: " + (peso - (g1 + g2)) + "KG");
		} else {
			System.out.println("não restou nada!");
		}
		sc.close();
	}
}
