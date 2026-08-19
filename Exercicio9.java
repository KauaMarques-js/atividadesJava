import java.util.Scanner;

public class Main
{
    	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua nota final: ");
        int NotaFinal = sc.nextInt();
        if(NotaFinal >= 7 ){
            System.out.println("Aprovado");
        }else{
             System.out.println("reprovado");
        }

	}
}