/*-Ler 80 números e ao finalinformar quantos número(s) est(á)ão no 
 * intervalo entre 10 (inclusive) e 150 (inclusive)*/

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
	
		int intervalo = 0, num;
		
		System.out.println("--Digite um número---");
		for(int i=0; i<5; i++) {
			num=scanner.nextInt();
		
		if(num>=10 && num<= 150) {
			intervalo++;
		
		
			}

		}
		System.out.println("Quantidade de números no intervalo entre 10 e 150:  "+ intervalo);
		
		scanner.close();
	}
}
	

