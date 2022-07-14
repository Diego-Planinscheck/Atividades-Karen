import java.util.Scanner;

public class dezoito {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, h;

        System.out.println("Qual a base do triangulo: ");
        b = sc.nextDouble();
        System.out.println("Qual a altura do triangulo: ");
        h = sc.nextDouble();

        a = (b * h)/2;

        System.out.println("A area do triangulo é: " + a);
    }
}
