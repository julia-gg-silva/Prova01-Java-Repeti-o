/*Escrever um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome 
 * e se ela é homem ou mulher. No final informe total de homens e de mulheres. (1 pontos)
 * sexo=scanner.next().charAt(0);
*/
import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);

		String nome;
		int fem=0, masc=0;
		int sexo;
		
	
		for(int i=0; i<5; i++) {
			
		System.out.println("--Informe o nome do candidato--");
		nome=scanner.next();
			
		System.out.println("--informe o sexo(F-1/M-2)--");
		sexo=scanner.nextInt();
		
		
		System.out.println("Nome: "+nome);
		
		if(sexo==1){
			fem++;	
	System.out.println("sexo:  Feminino");
				
		}if(sexo==2) {
			masc++;
			System.out.println("sexo:  Masculino");
		} 
	   }
		
		System.out.println("--Quantidade de candidatos fem--");
		System.out.println(fem);
		System.out.println("--Quantidade de candidados masc--");
		System.out.println(masc);
		
		scanner.close();
	  }
	}


