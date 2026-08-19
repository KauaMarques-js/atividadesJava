package main.java;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreve sua primeira nota :");
        double num1 = sc.nextDouble();

        System.out.println("Escreve sua segunda nota :");
        double num2 = sc.nextDouble();

        System.out.println("Escreve sua terceira nota :");
        double num3 = sc.nextDouble();

        System.out.println("Escreve sua quarta nota :");
        double num4 = sc.nextDouble();

        double media = ((num1 + num2 + num3 + num4) / 4);
        System.out.println("Sua media é : " + media);
    }
}
