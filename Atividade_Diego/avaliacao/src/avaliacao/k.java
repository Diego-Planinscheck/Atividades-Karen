package avaliacao;

import java.util.Scanner;

public class k {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double h, m;
		
		System.out.println("Horas: ");
		h = sc.nextDouble();
		System.out.println("Minutos: ");
		m = sc.nextDouble();
		
		h = h * 60;
		m = m + h;
		double s = m * 60;
		System.out.println("Segundos: " + s);
		sc.close();
	}
}
