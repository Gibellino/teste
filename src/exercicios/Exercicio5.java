package exercicios;

public class Exercicio5 {

	public Exercicio5() {
		// TODO Auto-generated constructor stub
		
		int[] n = new int[]{5,2,7};
		int produto=1;
		
		for(int i =0; i<n.length;i++){
		 produto*=n[i];	
		}
		
		System.out.println("O produto da multiplicação dos numeros é " + produto);
	}

}
