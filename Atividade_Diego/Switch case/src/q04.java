import java.util.Scanner;

public class q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double produtoValor = 1000, valorFinal = 0, parcelaValor = 0, diferenca;

        System.out.println("Opções de pagamento:\n1 - Pagamento à vista - 15% de desconto sobre o valor total da compra\n" +
                "2 - Pagamento com cheque pré-datado para 30 dias - 10% de desconto sobre o valor total da compra\n" +
                "3 - Pagamento parcelado em 6 vezes - não tem desconto\n" +
                "4 - Pagamento parcelado em 12 vezes - 8% de acréscimo sobre o valor da compra.\nDigite sua opcao: ");

        switch (sc.nextInt()){
            case 1 -> {
                valorFinal = produtoValor - (produtoValor * 0.15);
            }
            case 2 -> {
                valorFinal = produtoValor - (produtoValor * 0.1);
            }
            case 3 -> {
                valorFinal = produtoValor;
                parcelaValor = valorFinal / 6;
                System.out.println("Quantidade de parcelas: 6");
                System.out.println("Valor das parcelas: " + parcelaValor);
            }
            case 4 -> {
                valorFinal = produtoValor + (produtoValor * 0.08);
                parcelaValor = valorFinal / 12;
                System.out.println("Quantidade de parcelas: 12");
                System.out.println("Valor das parcelas: " + parcelaValor);
            }
        }
        diferenca = valorFinal - produtoValor;
        System.out.println("Valor da compra: " + produtoValor + "\nValor final: " + valorFinal);
        if(diferenca > 0){
            System.out.println("Juros: " + diferenca);
        } else {
            System.out.println("Desconto: " + diferenca);
        }
    }
}