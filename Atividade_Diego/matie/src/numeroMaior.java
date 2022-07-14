import java.util.Scanner;

public class numeroMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2;

        System.out.println("Insira um numero: ");
        n1 = sc.nextDouble();
        System.out.println("Insira um numero: ");
        n2 = sc.nextDouble();

        if(n1 > n2){
            System.out.println("O maior é: " + n1);
        }
        if(n2 > n1){
            System.out.println("O maior é: " + n2);
        }
    }

}
