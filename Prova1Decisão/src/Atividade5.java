import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	
	int idade=0, somaidade=0, avaliacao=0, otimo=0, bom=0, regular=0;
	
	for(int i=0; i<15; i++) {
		System.out.println("--Insira a idade--");
		idade= scanner.nextInt();
		idade++;
		
		System.out.println("--Opinião em relação ao filme--");
		System.out.println(" Ótimo-3, Bom-2, Regular-1");
		avaliacao=scanner.nextInt();
		
		if(avaliacao==3) {
			otimo++;
			somaidade=somaidade+idade;
		}else if(avaliacao==1) {
			regular++;
		}else {
			bom++;
			
		}
			
  }
	if(otimo!=0) {
	System.out.println("--Média de idades das que responderam ótimo--");
	System.out.println(somaidade/otimo-1);
	}else
		System.out.println("--Nenhuma pessoa respondeu ótimo.--");
	
	System.out.println("\n--Quantidade de pessoas que responderam regular--");
	System.out.println(regular);
	
	System.out.println("--Porcentagem de pessoas que respondeu bom --");
	System.out.println((bom*100)/15+"%");

	scanner.close();
	}
}
