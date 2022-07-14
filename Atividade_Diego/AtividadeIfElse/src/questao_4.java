import java.util.Scanner;

public class questao_4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int h1, m1, h2, m2, duracaoH, duracaoM;
        System.out.println("Jogo Inicio:\nHora:");
        h1 = sc.nextInt();
        System.out.println("Minuto: ");
        m1 = sc.nextInt();
        System.out.println("Jogo Termino:\nHora: ");
        h2 = sc.nextInt();
        System.out.println("Minuto: ");
        m2 = sc.nextInt();


        duracaoH = h2 - h1;
        duracaoM = m2 - m1;

        if (duracaoH < 0) {
            duracaoH = 24 + duracaoH;
        }
        if (duracaoM < 0) {
            duracaoH = duracaoH - 1;
            duracaoM = 60 + duracaoM;
        }
        System.out.println("Duração da partida: " + duracaoH + ":" + duracaoM + " Horas");
    }
}
