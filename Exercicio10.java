import java.util.Scanner;

public class Main
{
    	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Digite o pirmeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int num3 = sc.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println("Numero 1 é maior");
        }else if(num2 > num1 && num2 > num3){
             System.out.println("Numero 2 é maior");
        }else if(num3 > num1 && num3 > num2){
            System.out.println("Numero 3 é maior");
        }else{
            System.out.println("Algum são igual ou todos. ");
        }
        
        
	}
}