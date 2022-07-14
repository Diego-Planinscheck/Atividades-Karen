package avaliacao;

import java.util.Scanner;

public class m {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double s, k;
		
		System.out.println("Qual o salario minimo: ");
		s = sc.nextDouble();
		System.out.println("Quantidade quilowatts: ");
		k = sc.nextDouble();
		
		double c = s / 5;
		System.out.println("O custo de cada quilowatt: " + c);
		System.out.println("O custo total: " + (c * k));
		double d = (c*k) * 0.15;
		System.out.println("Desconto: " + ((c * k) - d));
		sc.close();
	}

}
