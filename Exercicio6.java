import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Qual a base do retângulo?");
        double base = sc.nextDouble();
        System.out.println("Qual a altura do retângulo?");
        double altura = sc.nextDouble();
        double area = base * altura; 
        double perimetro = 2*(base + altura);
         
         
        double diagonal = Math.sqrt(base * base + altura * altura);
        System.out.println(area);
        System.out.println(perimetro);
        System.out.println(diagonal);

	}
}