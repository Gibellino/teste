package exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public Exercicio6() {
		// TODO Auto-generated constructor stub
		
		Scanner read = new Scanner(System.in);
		
		int n;
		Boolean verif = false;
		
		System.out.println("Insira um numero: ");
		n = read.nextInt();
		
		for(int i=1;  i<n; i++){
			for(int j = 2; j<i;j++){
				if((i%j) == 0){
					verif = true;
					break;
				}
				else{
					verif = false;
				}
			}
			
			if(verif == false){
				System.out.println("O numero " + i + " é primo");
			}
			else{
				System.out.println("O numero " + i + " não é primo");
			}
		}
	}

}
