import java.util.Scanner;

public class questao_5 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double aumento = 0, novoSalario = 0;
        String cargo = "";

        System.out.println("Insira o código: ");
        int codigo = sc.nextInt();
        System.out.println("Salário atual: ");
        double salario = sc.nextDouble();

        if (codigo == 1) {
            cargo = "Escriturário";
            novoSalario = salario * 1.5;
            aumento = novoSalario - salario;
        } else if (codigo == 2) {
            cargo = "Secretário";
            novoSalario = salario * 1.35;
            aumento = novoSalario - salario;
        } else if (codigo == 3) {
            cargo = "Caixa";
            novoSalario = salario * 1.2;
            aumento = novoSalario - salario;
        } else if (codigo == 4) {
            cargo = "Gerente";
            novoSalario = salario * 1.1;
            aumento = novoSalario - salario;
        } else if (codigo == 5) {
            cargo = "Diretor";
            System.out.println("Diretores não possuem aumento");
        }
        System.out.println("Cargo: " + cargo + "\nAumento: " + aumento + "\nNovo salário: " + novoSalario);
    }
}
