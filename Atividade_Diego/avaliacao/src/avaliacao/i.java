package avaliacao;

import java.util.Scanner;

public class i {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double h, s, e;
		
		System.out.println("Qual o valor do salario minimo: ");
		s = sc.nextDouble();
		System.out.println("Quantas horas foram trabalhadas: ");
		h = sc.nextDouble();
		System.out.println("Hora extra: ");
		e = sc.nextDouble();
	
		double trabalhadas = s / 8;
		double extra = s / 4;
		double bruto = h * trabalhadas;
		double horasExtras = e * extra;
		double resultado = bruto + horasExtras;
		
		System.out.println("O salario total é: " + resultado);
		sc.close();
	}
}
