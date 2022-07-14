import java.util.Scanner;

public class mediaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3;
        System.out.println("Insira uma nota: ");
        n1 = sc.nextDouble();
        System.out.println("Insira uma nota: ");
        n2 = sc.nextDouble();
        System.out.println("Insira uma nota: ");
        n3 = sc.nextDouble();

        double media = (n1 + n2 + n3)/3;

        if(media > 0 && media < 3){
            System.out.println("Reprovado");
        }
        if(media >= 3 && media > 7){
            System.out.println("Exame");
        }
        if(media >= 7 && media <= 10){
            System.out.println("Aprovado");
        }
    }
}
