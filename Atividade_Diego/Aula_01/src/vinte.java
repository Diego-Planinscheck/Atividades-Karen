import java.util.Scanner;

public class vinte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade, idade2, idade3, ano, mes;

        System.out.println("Qual a sua idade(anos): ");
        idade = sc.nextInt();
        System.out.println("Qual a sua idade(mes): ");
        idade2 = sc.nextInt();
        System.out.println("Qual a sua idade(dias): ");
        idade3 = sc.nextInt();

        ano = idade * 365;
        mes = idade2 * 30;


        System.out.println("Idade em dias: " + (ano + mes + idade3));
    }
}
