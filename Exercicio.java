package main.java;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int num1 = sc.nextInt();
        System.out.println("Digite um numero inteiro ");
        int num2 = sc.nextInt();

        int soma = (num1 + num2);
        int sub = (num1 - num2);
        int mult = (num1 * num2);
        int divisao = (num1 / num2);
        int resto = (num1 % num2);
        System.out.println("Está e a soma: " + soma);
        System.out.println("Está e a subtração: " + sub);
        System.out.println("Está e o produto: " + mult);
        System.out.println("Está e a divisao: " + divisao);
        System.out.println("Está e o resto: " + resto);

    }

}
