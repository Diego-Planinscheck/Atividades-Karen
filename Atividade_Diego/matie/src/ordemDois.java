import java.util.Scanner;

public class ordemDois {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        double a = sc.nextDouble();
        System.out.println("Digite um numero: ");
        double b = sc.nextDouble();
        System.out.println("Digite um numero: ");
        double c= sc.nextDouble();
        System.out.println("Digite um numero: ");
        double d = sc.nextDouble();

        if(d > c){
            System.out.println(d + "," + c + "," + b + "," + a);
        }
        if(d > b && d < c){
            System.out.println(c + "," + d + "," + b + "," + a);
        }
        if(d > a && d < b){
            System.out.println(c + "," + b + "," + d + "," + a);
        }
        if(d > a){
            System.out.println();
        }
    }
}
