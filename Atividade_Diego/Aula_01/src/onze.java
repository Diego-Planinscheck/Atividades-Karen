import java.util.Scanner;

public class onze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome, endereco, telefone;

        System.out.println("Nome: ");
        nome = sc.next();
        System.out.println("Endereco: ");
        endereco = sc.next();
        System.out.println("Telefone: ");
        telefone = sc.next();

        System.out.println("Nome: " + nome + "\nEndereco: " + endereco + "\nTelefone: " + telefone);
    }
}
