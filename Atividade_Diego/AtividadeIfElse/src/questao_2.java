import java.util.Scanner;

public class questao_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, m, a, h, min;
        String mString = "";

        System.out.print("Dia: ");
        d = sc.nextInt();
        System.out.print("Mês: ");
        m = sc.nextInt();
        System.out.print("Ano: ");
        a = sc.nextInt();
        System.out.print("Hora: ");
        h = sc.nextInt();
        System.out.print("Minuto: ");
        min = sc.nextInt();

        if (m == 1) {
            mString = "Janeiro";
        } else if (m == 2) {
            mString = "Fevereiro";
        } else if (m == 3) {
            mString = "Março";
        } else if (m == 4) {
            mString = "Abril";
        } else if (m == 5) {
            mString = "Maio";
        } else if (m == 6) {
            mString = "Junho";
        } else if (m == 7) {
            mString = "Julho";
        } else if (m == 8) {
            mString = "Agosto";
        } else if (m == 9) {
            mString = "Setembro";
        } else if (m == 10) {
            mString = "Outubro";
        } else if (m == 11) {
            mString = "Novembro";
        } else if (m == 12) {
            mString = "Dezembro";
        }

        System.out.println(d + "/" + mString + "/" + a + "  " + h + ":" + min);

    }
}
