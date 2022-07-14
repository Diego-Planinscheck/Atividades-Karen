package avaliacao;

import java.util.Scanner;

public class f {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double minimo = 1000, salario;
		int q = 0;
		System.out.println("Qual o seu salario: ");
		salario = sc.nextDouble();
		while(minimo <= salario) {
			minimo += 1000;
			q++;
		}		
		System.out.println("A quantidade de salario minimos necessarios é: " + q);
		sc.close();
	}
}
