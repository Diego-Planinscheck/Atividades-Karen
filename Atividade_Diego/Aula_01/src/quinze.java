import java.sql.SQLOutput;
import java.util.Scanner;

public class quinze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2;
        System.out.println("Digite um numero: ");
        n1 = sc.nextDouble();
        System.out.println("Digite outro valor: ");
        n2 = sc.nextDouble();
        double media = (n1 + n2)/2;
        System.out.println("Média: " + media);
    }
}
