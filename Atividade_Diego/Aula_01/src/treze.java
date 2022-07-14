import java.util.Scanner;

public class treze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2;
        System.out.println("Digite um valor: ");
        n1 = sc.nextInt();
        System.out.println("Digite outro valor: ");
        n2 = sc.nextInt();

        System.out.println("Produto: " + (n1 * n2));
    }
}
