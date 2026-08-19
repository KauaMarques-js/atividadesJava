import java.util.Scanner;

public class Main
{
    	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
        int num = sc.nextInt();
        if(num % 2 == 1){
            System.out.println("Impár");
        }else{
            System.out.println("Par");
        }
    
	}
}