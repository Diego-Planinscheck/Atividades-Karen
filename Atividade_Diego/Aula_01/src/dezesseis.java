import java.util.Scanner;

public class dezesseis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double b, a;
        System.out.println("Base: ");
        b = sc.nextDouble();
        System.out.println("Altura: ");
        a = sc.nextDouble();
        System.out.println("Area: " + (b * a));
        System.out.println("Perimetro: " + ((2 * a) + (2 * b)));
    }
}
