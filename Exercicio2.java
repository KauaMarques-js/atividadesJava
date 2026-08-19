package main.java;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dolar = 5.22;
        System.out.println("Digite um valor que será convertido para dolar: ");
        double real = sc.nextDouble();
        double valorConvertido = (real / dolar);
        System.out.printf("%.2f", valorConvertido );


    }

}
