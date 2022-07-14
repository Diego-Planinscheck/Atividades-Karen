package avaliacao;

import java.util.Scanner;

public class g {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int multi, x, n;

		System.out.println("Digite apenas de 1 a 10 para que seja imprimida a tabuada!");
		n = sc.nextInt();
		sc.close();

		for (x = 1; x <= 10; x++) {
			multi = n * x;
			System.out.println(n + "x" + x + " = " + multi);
		}
	}
}
