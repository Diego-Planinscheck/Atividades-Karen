import java.util.Scanner;

public class sete {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i;
        double a, b, c;
        System.out.println("I: ");
        i = sc.nextInt();
        System.out.println("A: ");
        a = sc.nextInt();
        System.out.println("B: ");
        b = sc.nextInt();
        System.out.println("C: ");
        c = sc.nextInt();
        if (i == 1) {
            if (a < b && a < c) {
                if (b < c) {
                    System.out.println(a + "," + b + "," + c);
                }
                if (c < b) {
                    System.out.println(a + "," + c + "," + b);
                }
            }
            if (b < a && b < c) {
                if (a < c) {
                    System.out.println(a + "," + b + "," + c);
                }
                if (c < b) {
                    System.out.println(a + "," + c + "," + b);
                }
            }
            if (c < a && c < b) {
                if (a < b) {
                    System.out.println(a + "," + b + "," + c);
                }
                if (b < a) {
                    System.out.println(a + "," + c + "," + b);
                }
            }
        }
        if (i == 2) {
            if (a < b && a < c) {
                if (b < c) {
                    System.out.println(a + "," + b + "," + c);
                }
                if (c < b) {
                    System.out.println(a + "," + c + "," + b);
                }
            }
            if (b < a && b < c) {
                if (a < c) {
                    System.out.println(a + "," + b + "," + c);
                }
                if (c < b) {
                    System.out.println(a + "," + c + "," + b);
                }
            }
            if (c < a && c < b) {
                if (a < b) {
                    System.out.println(a + "," + b + "," + c);
                }
                if (b < a) {
                    System.out.println(a + "," + c + "," + b);
                }
            }
        }
        if (i == 3) {
            if (a < b && a < c) {
                if (b < c) {
                    System.out.println(a + "," + b + "," + c);
                }
                if (c < b) {
                    System.out.println(a + "," + c + "," + b);
                }
            }
            if (b < a && b < c) {
                if (a < c) {
                    System.out.println(a + "," + b + "," + c);
                }
                if (c < b) {
                    System.out.println(a + "," + c + "," + b);
                }
            }
            if (c < a && c < b) {
                if (a < b) {
                    System.out.println(a + "," + b + "," + c);
                }
                if (b < a) {
                    System.out.println(a + "," + c + "," + b);
                }
            }
        }
    }
}
