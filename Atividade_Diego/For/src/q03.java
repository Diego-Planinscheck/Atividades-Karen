import java.util.Scanner;

public class q03 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int codigo, pecas, maiorSalario = 0, contadorHomem = 0, contadorMulher = 0, totalPecas = 0;
        String genero;

        double folhaPagamentoEmpresa = 0, mediaPecasHomens = 0, mediaPecasMulheres = 0, salarioMinimo, salario,
                maiorSalarioEmpregado = 0;


        System.out.println("Qual o salario minimo: ");
        salarioMinimo = sc.nextDouble();

        for (int i = 1; i <= 2; i++) {
            System.out.println("Qual o seu código: ");
            codigo = sc.nextInt();

            System.out.println("Peças produzidas no mês: ");
            pecas = sc.nextInt();

            System.out.println("Qual o seu gênero ('homem', 'mulher'): ");

            genero = sc.next();

            if (pecas <= 30) {
                salario = salarioMinimo;
            } else if (pecas <= 50) {
                salario = salarioMinimo + ((salarioMinimo * 0.03) * (pecas - 30));
            } else {
                salario = salarioMinimo + ((salarioMinimo * 0.05) * (pecas - 30));
            }

            if (i == 1) {
                maiorSalarioEmpregado = salario;
                maiorSalario = codigo;
            } else {
                if (salario > maiorSalarioEmpregado) {
                    maiorSalarioEmpregado = salario;
                    maiorSalario = codigo;
                }
            }

            if (genero.equals("homem")) {
                contadorHomem++;
                mediaPecasHomens += pecas;
            } else {
                contadorMulher++;
                mediaPecasMulheres += pecas;
            }

            folhaPagamentoEmpresa += salario;
            totalPecas += pecas;

            System.out.println("Codigo funcionario: " + codigo);
            System.out.println("Salario: " + salario);
        }

        System.out.println("Total folha de pagamento: " + folhaPagamentoEmpresa);
        System.out.println("Total de peças produzidas: " + totalPecas);
        System.out.println("Média peças produzidas homem: " + (mediaPecasHomens / contadorHomem));
        System.out.println("Média peças produzidas mulher: " + (mediaPecasMulheres / contadorMulher));

        System.out.println("Funcionário com maior salario: \nCodigo" + maiorSalario);
    }
}