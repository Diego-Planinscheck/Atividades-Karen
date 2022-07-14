import java.util.Scanner;

public class q03 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double n = 0, maior = 0, menor = 30000, porc = 0;
        int soma = 0, cont = 0, somaPares = 0, qtdPares = 0;

        while (n != 30000) {
            System.out.println("Digite um número: ");
            n = sc.nextDouble();
            if (n == 30000) {
                break;
            }
            soma += n;
            cont++;
            if (n < menor) {
                menor = n;
            }
            if (n > maior) {
                maior = n;
            }
            if (n % 2 == 0) {
                qtdPares++;
                somaPares += n;
            }
            porc = (((cont - qtdPares) * 100) / cont);
        }

        System.out.println("Soma do numeros: " + soma);
        System.out.println("Total de números: " + cont);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Media Pares: " + (somaPares / qtdPares));
        System.out.println("Porcentagem impares: " + porc);

    }
}
