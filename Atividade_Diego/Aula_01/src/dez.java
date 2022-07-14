import java.util.Scanner;

public class dez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, ant, suc;
        System.out.println("Digite um valor: ");
        n = sc.nextInt();

        ant = n - 1;
        suc = n + 1;

        System.out.println("Antecessor: " + ant + "\nSucessor: " + suc);
    }
}
