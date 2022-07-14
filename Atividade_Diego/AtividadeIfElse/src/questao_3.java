import java.util.Scanner;

public class questao_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d1, m1, a1, d2, m2, a2, n1, n2;

        System.out.println("Primeira data: ");
        System.out.print("Dia: ");
        d1 = sc.nextInt();
        System.out.print("Mês: ");
        m1 = sc.nextInt();
        System.out.print("Ano: ");
        a1 = sc.nextInt();
        n1 = (a1 * 365) + (m1 * 30) + d1;

        System.out.println("Segunda data: ");
        System.out.print("Dia: ");
        d2 = sc.nextInt();
        System.out.print("Mês: ");
        m2 = sc.nextInt();
        System.out.print("Ano: ");
        a2 = sc.nextInt();
        n2 = (a2 * 365) + (m2 * 30) + d2;

        if (n1 < n2) {
            System.out.println("A data: " + d1 + "/" + m1 + "/" + a1 + " vem antes");
        } else if (n2 < n1) {
            System.out.println("A data: " + d2 + "/" + m2 + "/" + a2 + " vem antes");
        } else {
            System.out.println("As datas são iguais.");
        }
    }
}
