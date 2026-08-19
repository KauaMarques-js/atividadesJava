package main.java;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual valor da hora fiote? ");
        double valorhoras = sc.nextDouble();
        System.out.println("Qual a quantidade de horas por mês: ");
        double horas = sc.nextDouble();
        double salariobruto = valorhoras * horas;
        double descontoinss = salariobruto * 0.08;
        double salarioliquido = salariobruto - descontoinss;

        System.out.printf("Salário bruto: R$ %.2f%n", salariobruto);
        System.out.printf("Desconto INSS: R$ %.2f%n", descontoinss);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioliquido);

    }
}
