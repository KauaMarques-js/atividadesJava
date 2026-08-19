package main.java;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Qual o raio do Circulo? ");
        double raio = sc.nextDouble();
        double perimetro = (2 * pi * raio);
        System.out.println(perimetro);
        double area = pi * (raio*raio);
        System.out.println(area);

    }
}
