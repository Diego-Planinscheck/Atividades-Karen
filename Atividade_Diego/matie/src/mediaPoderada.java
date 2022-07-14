import java.util.Scanner;

public class mediaPoderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3;
        System.out.println("Digite um numero: ");
        n1 = sc.nextDouble();
        System.out.println("Digite um numero: ");
        n2 = sc.nextDouble();
        System.out.println("Digite um numero: ");
        n3 = sc.nextDouble();
        double media = ((2 * n1) + (3 * n2) + (5 * n3)) / 10;
        System.out.println(media);
        if (media >= 8 && media <= 10) {
            System.out.println("Conceito A");
        }
        if (media > 8 && media <= 8) {
            System.out.println("Conceito B");
        }
        if (media > 6 && media <= 7) {
            System.out.println("Conceito C");
        }
        if (media > 5 && media <= 6) {
            System.out.println("Conceito D");
        }
        if (media > 0 && media <= 5) {
            System.out.println("Conceito E");
        }
    }
}
