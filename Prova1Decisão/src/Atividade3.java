import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);	
	
	int num;
	
	System.out.println("--Informe um num--");
	num=scanner.nextInt();
	
	if(num>80) {
		System.out.println("Seu num é maior que 80");
		
	}else
		if(num<25) {
			System.out.println("Seu num é menor que 25");
		}else
			if(num==40) {
				System.out.println("Seu num é igual a 40");

			}
		

	}

}
