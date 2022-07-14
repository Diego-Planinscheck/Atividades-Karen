import java.util.Scanner;

public class q02 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double peso, valor = 0, pesoTotal = 0, imposto, totalPreco = 0;

        System.out.println("Codigo do produto: \n1, 2, 3, 4, \n5, 6, 7, \n8, 9, 10");
        int produto = sc.nextInt();
        System.out.println("Codigo pais: (1, 2, 3)");
        int pais = sc.nextInt();
        System.out.println("Peso produto: ");
        peso = sc.nextInt();
        if (produto >= 1 && produto <= 4) {
            pesoTotal = peso * 1000;
            valor = pesoTotal * 10;
        } else if (produto >= 5 && produto <= 7) {
            pesoTotal = peso * 1000;
            valor = pesoTotal * 10;
        } else if (produto >= 8 && produto <= 10) {
            pesoTotal = peso * 1000;
            valor = pesoTotal * 10;
        }else {
            System.out.println("Codigo invalido!");
        }
        switch (pais) {
            case 1 -> {
                imposto = 0;
                totalPreco = imposto + valor;
                System.out.println("O peso é: " + pesoTotal + "\nPreco total: " + valor + "\nImposto: " + imposto + "\nPreco produto + imposto: "+ totalPreco);
            }
            case 2 -> {
                imposto = valor * 0.15;
                totalPreco = imposto + valor;
                System.out.println("O peso é: " + pesoTotal + "\nPreco total: " + valor + "\nImposto: " + imposto + "\nPreco produto + imposto: "+ totalPreco);
            }
            case 3 -> {
                imposto = valor * 0.25;
                totalPreco = imposto + valor;
                System.out.println("O peso é: " + pesoTotal + "\nPreco total: " + valor + "\nImposto: " + imposto + "\nPreco produto + imposto: "+ totalPreco);
            }
        }
    }
}
