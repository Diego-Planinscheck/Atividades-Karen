import java.util.Scanner;

public class q01 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double salario;
        int cont = 0;

        System.out.println("Qual o seu salario: ");
        salario = sc.nextDouble();

        double salarioJao = salario / 3;

        while (salario >= salarioJao) {
            salario += salario * 0.02;
            salarioJao += salarioJao * 0.05;
            cont++;
        }
        System.out.println(cont);
    }
}
