import java.util.Scanner;

public class jokenpojogo {

	public static void main(String[] args) {
	
		    //lógica de jogador
			int jogador;
			Scanner mao = new Scanner(System.in);
			System.out.println("---------------------------");
			System.out.println("-----------JokenPo---------");
			System.out.println("---------------------------");
			System.out.println("");
			System.out.println("1. Pedra");
			System.out.println("2. Papel");
			System.out.println("3. Tesoura");
			System.out.println("Digite a opção desejada:");
			jogador = mao.nextInt();
			
			
			//estrutura switch case admite apenas tipo int e char
			switch (jogador) {
			case 1:
				System.out.println("jogador escolheu PEDRA");
				break;
				
			case 2:
				System.out.println("jogador escolheu PAPEL");
				break;
				
			case 3:
				System.out.println("jogador escolheu TESOURA");
				break;
				
			default:
			
				System.out.println("Opção inválida");
				break;
			
		
		}
		//lógica do computador
			//a linha abaixo gera números aleatórios entre 0 e 2
			//(int) converte para o tipo  inteiro (casting)
			//+1 soma 1 ao resultado (1 ou 2 ou 3)
		
		int computador = (int)(Math.random()*3+1);
		switch (computador) {
		case 1:
			System.out.println("computador escolheu PEDRA");
			break;
			
		case 2:
			System.out.println("computador escolheu PAPEL");
			break;
			
		case 3:
			System.out.println("computador escolheu TESOURA");
			break;
			
		default:
		
			System.out.println("Opção inválida");
			break;
		

		
		
		}
		//lógica para determinar o vencedor ou empate 
		if (jogador == computador) {
			System.out.println("Empate");
		}else {
			if((jogador== 1 && computador == 3)||(jogador== 2 && computador == 1)|| (jogador == 3 && computador ==2)) {
			  System.out.println("JOGADOR VENCEU");	
			}else {
				System.out.println("COMPUTADOR VENCEU");
			}
		}
		mao.close();
		

	}

}
