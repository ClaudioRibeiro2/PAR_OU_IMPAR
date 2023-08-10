import java.util.Scanner;
import java.util.Random;

// Criacao da Classe
public class Par_impar {
	// Método principal
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	int escolha, num, num2, m, n;
	int menu1 = 0;
	int menu2 = 0;	

	System.out.println("Bem vindo Jogador 1 ao jogo de impar ou par!\nESCOLHA 2 PARA PAR E 1 PARA IMPAR");
	escolha = sc.nextInt();
	
	if(escolha == 1 || escolha == 2){ // impar
		if (escolha == 1){
			System.out.println("IMPAR ESCOLHIDO");
		} else {
			System.out.println("PAR ESCOLHIDO");
		}
		System.out.println("Escolha um numero entre 0 a 10 para jogar contra Jogador 2");
		num = sc.nextInt();
		if(num >= 0 && num <= 10){ // validação do num
			num2 = r.nextInt(11);
			m = num + num2;
			System.out.printf("Numero do Jogador 2 = %d\n", num2);
			n = m % 2;
			if (n == 0){
				System.out.println("PAR GANHOU!");
			} else {
				System.out.println("IMPAR GANHOU!");
			}		
			} else {
				System.out.println("Numero inválido");
			}		
	}else{
		System.out.println("Numero inválido");
	}
	} // Fim do método principal
} // Fim da Classe