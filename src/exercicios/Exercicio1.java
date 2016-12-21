package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public Exercicio1() {
		// TODO Auto-generated constructor stub
		
		Scanner read = new Scanner(System.in);
		
		char[] c = new char[5];
		int ac = 0;
		
		for(int i = 0; i<5; i++){
			System.out.println("Insira um caracter: ");
			c[i] = read.next().charAt(0);
			
			if(c[i] == '0' || c[i] == '1' || c[i] == '2' || c[i] == '3' || c[i] == '4' 
			|| c[i] == '5' || c[i] == '6' || c[i] == '7' || c[i] == '8' || c[i] == '9'){
				ac++;
			}
		}
		
		System.out.println("\nForam inseridos " + ac + " numeros!");
	}

}
