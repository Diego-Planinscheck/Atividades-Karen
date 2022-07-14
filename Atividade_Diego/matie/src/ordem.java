import java.util.Arrays;
import java.util.Scanner;

public class ordem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3;

        System.out.println("Primiero numero?");
        n1 = sc.nextDouble();
        System.out.println("Primiero numero?");
        n2 = sc.nextDouble();
        System.out.println("Primiero numero?");
        n3 = sc.nextDouble();

        if (n1 < n2 && n2 < n3) {
            if (n2 < n3) {
                System.out.println(n1 + "," + n2 + "e" + n3);
            }
            if (n3 < n2) {
                System.out.println(n1 + "," + n3 + "e" + n2);
            }

        }
        if (n2 < n1 && n2 < n3) {
            if (n1 < n3) {
                System.out.println(n2 + "," + n1 + "e" + n3);
            }
            if (n1 < n2) {
                System.out.println(n2 + "," + n3 + "e" + n1);
            }

        }
        if (n3 < n2 && n3 < n1) {
            if (n3 < n1) {
                System.out.println(n3 + "," + n1 + "e" + n2);
            }
            if (n3 < n2) {
                System.out.println(n3 + "," + n2 + "e" + n1);
            }

        }
    }
}
