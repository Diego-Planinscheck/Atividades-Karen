import java.util.Scanner;

public class q03 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double criterioA, criterioB;

        System.out.println("Quantidade de livros: ");
        int qtd = sc.nextInt();
        criterioA = (0.25 * qtd) + 7.50;
        criterioB = (0.50 * qtd) + 2.50;

        if (criterioA > criterioB) {
            System.out.println("O criterio B vale mais a pena que o A");
        } else if(criterioB > criterioA){
            System.out.println("O criterio A vale mais a pena que o B");
        } else {
            System.out.println("O dois possuem o mesmo preço");
        }
    }
}
