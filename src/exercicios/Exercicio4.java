package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public Exercicio4() {
		// TODO Auto-generated constructor stub
		
		Scanner read = new Scanner(System.in);
		
		char op;
		int pessoas = 0,
				camisa = 0;
		float precoB = 0;
		
		do{
			System.out.println("O socio usava camisola do clube? (c/n)");
			op = read.next().charAt(0);
			
			if(op == 'c'){
				pessoas++;
				camisa+=14;
				precoB+=7.50;
			}
			else if(op == 'n'){
				pessoas++;
				precoB+=7.50;
			}
			else if(op == 's'){
				System.out.println("\nVai Sair!\n");
				break;
			}
			else{
				System.out.println("\nOpção Inválida!\n");
			}
			
			System.out.println("");
			
		}while(true);
		
		System.out.println("Foram comprados " + pessoas + " bilhetes.\n"
				+ "Angariou-se " + precoB + " euros com a venda dos bilhetes.\n"
				+ "E " + camisa + " euros com a venda das camisolas");
	}

}
