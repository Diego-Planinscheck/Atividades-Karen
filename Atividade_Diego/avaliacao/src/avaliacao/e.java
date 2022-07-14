package avaliacao;

import java.util.Scanner;

public class e {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Qual o seu salario: ");
		double salario = sc.nextDouble();
		System.out.println("Qual o valor das suas vendas: ");
		double valor = sc.nextDouble();
		
		double total = salario + (valor * 0.04);
		System.out.println("O valor total do salario é: " + total);
		sc.close();
	} 
}
