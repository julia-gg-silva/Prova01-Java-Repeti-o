import java.util.Scanner;

public class Atividade6 {
	
	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
		
		int num=0, idade=0, somaidade=0, sexo=0, fem=0, masc=0, olhos=0, olhosverdes=0, cabelos=0, cabelosLouros=0;
		int  altura=0, somaaltura=0;
		int   somapeso=0,peso=0, participante = 0;
		
		
	
		System.out.println("--Você deseja realizar o cadastro?(Digite 1-Sim/ 0-Não)--");
		num=scanner.nextInt();
		
		while(num!=0) {
			
			participante++;
			System.out.println("--Informe o sexo(Feminino-1/ Masculino-2)--");
			sexo=scanner.nextInt();
				if(sexo==1) {
					fem++;
				}if(sexo==2) {
					masc++;
				}
			System.out.println("--Informe a cor dos olhos(Azuis-1/ Verdes-2/ Castanhos-3)--");
			olhos=scanner.nextInt();
				if(olhos==2) {
				olhosverdes++;
				}
			System.out.println("--Informe a cor dos cabelos(Louros-1/ Castanhos-2/ Pretos-3)--");
			cabelos=scanner.nextInt();
				if(cabelos==1) {
				cabelosLouros++;
				}
			System.out.println("--Informe a idade--");
			idade=scanner.nextInt();
			somaidade=somaidade+idade;
		
			System.out.println("--Informe o peso--");
			peso=scanner.nextInt();
			somapeso=somapeso+peso;
			
			System.out.println("--Informe a altura--");
			altura=scanner.nextInt();
			somaaltura=somaaltura+altura;
			
			System.out.println("--CADASTRO FINALIZADO--(Digite 1-Sim/ 0-Não)");
			System.out.println("Deseja realizar outro?");
			num=scanner.nextInt();			
			
		}
		System.out.println("--Média de idade--");
		System.out.println(somaidade/participante);
		
		System.out.println("--Média de peso--");
		System.out.println(somapeso/participante);
		
		System.out.println("--Média de altura--");
		System.out.println(somaaltura/participante);
		
		System.out.println("--Porcentagem Feminino--");
		System.out.println(fem*100/participante+"%");
		
		System.out.println("--Porcentagem Masculino--");
		System.out.println(masc*100/participante+"%");
		
		System.out.println("--Pessoas com olhos verdes--");
		System.out.println(olhosverdes);
		
		System.out.println("--Pessoas com cabelos louros--");
		System.out.println(cabelosLouros);
		
		scanner.close();
	}
	

}
