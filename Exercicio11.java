import java.util.Scanner;

public class Main
{
    	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu consumo mensal: ");
        double consumoMensal = sc.nextDouble();
        double preco;
        if(consumoMensal <= 100){
            preco = consumoMensal * 0.50;
            
        } else if( consumoMensal <= 300 ){
            preco = consumoMensal * 0.75;
        }else{
            preco = consumoMensal * 1.10;
        }
        System.out.println(preco + " reais a ser pago, devido ao consumo");
        
	}
}