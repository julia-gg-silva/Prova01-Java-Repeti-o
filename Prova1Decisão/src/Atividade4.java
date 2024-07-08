import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	
	int codigo=0, transacao=0, avista=0, aprazo=0;
	
	
	
	
	for(int i=0; i<15; i++) {
		System.out.println("--Insira o código da transação--(1-À vista/ 2- À prazo)");
		codigo=scanner.nextInt();
		System.out.println("--Insira o valor da transação--");
		transacao=scanner.nextInt();
		
		if(codigo==1) {	
		avista=avista+transacao;
		
		}if(codigo==2) {
		aprazo=aprazo+transacao;
		
		}
     }
	System.out.println("--Total das compras à vista--");
	System.out.println(avista);
	
	System.out.println("--Total das compras à prazo--");
	System.out.println(aprazo);
	
	System.out.println("--Valor da primeira parcela das compras a prazo--");
	System.out.println(aprazo/3);
	
	System.out.println("--Valor total das compras--");
	System.out.println(avista+aprazo);
	
	
	
	}
}
