import java.util.Scanner;

public class q01 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double aumento = 0;

        System.out.println("Codigo do cargo:\n1- Escrituario\n2- Secretario\n3- Caixa\n4- Gerente\n5- Diretor");
        int opcao = sc.nextInt();
        System.out.println("Salário atual? ");
        double salario = sc.nextDouble();
        switch (opcao){
            case 1:
                aumento = salario * 0.5;
                salario += aumento;
                System.out.println("Cargo: Caixa\nNovo Salario: " + salario + "\nValor Aumento: " + aumento);
                break;
            case 2:
                aumento = salario * 0.35;
                salario += aumento;
                System.out.println("Cargo: Caixa\nNovo Salario: " + salario + "\nValor Aumento: " + aumento);
                break;
            case 3:
                aumento = salario * 0.20;
                salario += aumento;
                System.out.println("Cargo: Caixa\nNovo Salario: " + salario + "\nValor Aumento: " + aumento);
                break;
            case 4:
                aumento = salario * 0.10;
                salario += aumento;
                System.out.println("Cargo: Caixa\nNovo Salario: " + salario + "\nValor Aumento: " + aumento);
                break;
            case 5:
                System.out.println("Cargo: Caixa\nNovo Salario: " + salario + "\nValor Aumento: " + aumento);
                break;
        }
    }
}
