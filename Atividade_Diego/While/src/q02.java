import java.util.Scanner;

public class q02 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double n = 1;

        while (n != 0) {
            System.out.println("Digite um valor: ");
            n = sc.nextDouble();
            if (n != 0) {
                System.out.println(n);
                System.out.println(Math.pow(n, 2));
                System.out.println(Math.pow(n, 3));
                System.out.println(Math.sqrt(n));
            }
        }
    }
}
