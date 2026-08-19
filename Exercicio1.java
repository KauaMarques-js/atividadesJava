import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();

        System.out.println(nome + " tem " + idade + " anos e mede " + altura + " metros.");

        scanner.close();
    }
}