package avaliacao;

import java.util.Scanner;

public class h {
	public static void main(String[] args) {
		double m1, m2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o seu salario: ");
		double salario = sc.nextDouble();
		
		
		System.out.println("Qual o valor da conta 1: ");
		m1 = sc.nextDouble();
		m1 = m1 * 1.02;
		System.out.println("Qual o valor da conta 2: ");	
		m2 = sc.nextDouble();
		m2 = m2 * 1.02;
		System.out.println("Salario sobrante: " + (salario - (m1 + m2)));
		
		sc.close();
	}
}
