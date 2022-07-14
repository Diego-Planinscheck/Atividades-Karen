import java.util.Scanner;

public class q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, i = 2, divisao = 0;

        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        do {
            if (numero % i == 0) {
                divisao++;
            }
            i++;
        } while (i < numero);

        if (divisao == 0) {
            System.out.println("O número " + numero + " é  primo");
        } else {
            System.out.println("O número " + numero + " não é primo");
        }
        sc.close();
    }
}
