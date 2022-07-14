import java.util.Scanner;

public class dezessete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r, p, a;

        System.out.println("Qual o raio do circulo: ");
        r = sc.nextDouble();

        p = 2 * 3.14 * r;
        a = 3.14 * (r * r);

        System.out.println("A area é: " + a);
        System.out.println("O perimetro é: " + p);
    }
}
