import java.util.Scanner;

public class doze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, n2;
        System.out.println("Digite um valor: ");
        n = sc.nextInt();
        System.out.println("Digite outro valor: ");
        n2 = sc.nextInt();
        int soma = n + n2;
        System.out.println("Soma: " + soma);
    }
}
