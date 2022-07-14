import java.util.Scanner;

public class q04 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int qw = 1, cont = 0, tipo;
        double valorPagar = 0, total = 0, salario;

        while (qw != 0) {
            System.out.print("Qual o valor do seu salário mínimo: ");
            salario = sc.nextDouble();
            System.out.print("Quantos QuiloWatts gastou: ");
            qw = sc.nextInt();
            if (qw == 0) {
                break;
            }
            System.out.println("Tipo de consumidor:\n1- Residencial\n2- Comercial\n3- Industrial");
            tipo = sc.nextInt();
            System.out.println("Valor do QuiloWatt: R$" + (salario / 8));
            switch (tipo) {
                case 1:
                    valorPagar = (((salario / 8) * qw) + ((salario / 8) * qw) * 0.05);
                    System.out.println("Acréscimo: 5% \nValor a ser pago: R$" + valorPagar);
                    break;
                case 2:
                    valorPagar = (((salario / 8) * qw) + ((salario / 8) * qw) * 0.10);
                    System.out.println("Acréscimo: 10% \nValor a ser pago: R$" + valorPagar);
                    break;
                case 3:
                    valorPagar = (((salario / 8) * qw) + ((salario / 8) * qw) * 0.15);
                    System.out.println("Acréscimo: 15% \nValor a ser pago: R$" + valorPagar);
                    break;
            }
            if (valorPagar >= 500 && valorPagar <= 1000) {
                cont++;
            }
            total += valorPagar;
        }
        System.out.println("Faturamento geral da empresa: " + total + "\nQuantidade de consumidres que gastam de R$ 500,00 à R$ 1000,00: " + cont);
    }
}
