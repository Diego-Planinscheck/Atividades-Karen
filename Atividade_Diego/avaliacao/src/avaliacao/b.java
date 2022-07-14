package avaliacao;
import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Escreva um numero: ");
		a = sc.nextInt();
		System.out.println("Escreva um numero: ");
		b = sc.nextInt();
		System.out.println("Escreva um numero: ");
		c = sc.nextInt();
		
		System.out.println(a * b * c);
		sc.close();
	}
	
}
