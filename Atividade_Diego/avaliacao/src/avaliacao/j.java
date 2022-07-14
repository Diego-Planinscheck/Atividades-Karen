package avaliacao;

import java.util.Scanner;

public class j {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantidade de dinheiro: ");
		double valor = sc.nextDouble();
		
		double euro = valor / 5.23;
		double dolar = valor / 4.97;
		double libra = valor / 6.25;
		
		System.out.println("Euro: " + euro + "\nDolar: " + dolar + "\nLibra: " + libra);
		sc.close();
	}
}
