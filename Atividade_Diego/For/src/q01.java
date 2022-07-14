import java.util.Scanner;

public class q01 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int multi, numero;
        System.out.println("Digite um numero: 1 a 10");
        numero = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            multi = numero * i;
            System.out.println(numero + " x " + i + " = " + multi);
        }
    }
}
