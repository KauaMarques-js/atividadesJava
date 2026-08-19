import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    System.out.println("quantos graus celsius meu guri? ");
    double celsius = sc.nextDouble();
    System.out.println(celsius + " Graus celsius");
    double fah = (celsius * 9/5) + 32;
    double kelvin = celsius + 273.15;
    System.out.println(fah + " Graus Fahrenheit");
    System.out.println(kelvin + " Graus Kelvin");
        

	}
}