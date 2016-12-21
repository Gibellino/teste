package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {

	Random ran = new Random();
	Scanner read = new Scanner(System.in);
	
	public int rand(){
		
		int r = ran.nextInt(11);
		
		return r;
	}
	
	public Exercicio2() {
		
		/*for(int i=0; i<20; i++){
			System.out.println(rand());
		}*/
		
		int n= rand(), ac = 0;
		char op;
		
		do{
		
			System.out.println("O numero é " + n + "!"
					+ "\nO próximo numero é maior ou menor? (c/b)");
			op = read.next().charAt(0);
			
			int n2 = rand();
			
			if(op == 'c'){
				if(n < n2){
					System.out.println("\nParabens! Acertou.\n");
					ac++;
				}
				else{
					System.out.println("\nErrou!");
					break;
				}
			}
			else if(op == 'b'){
				if(n > n2){
					System.out.println("\nParabens! Acertou.\n");
					ac++;
				}
				else{
					System.out.println("\nErrou!\n");
					break;
				}
			}
			else{
				System.out.println("\nopção invalida\n");
			}
			n = n2;
			
		}while(true);
		
		System.out.println("Acertou " + ac + " vezes.");
	}

}
