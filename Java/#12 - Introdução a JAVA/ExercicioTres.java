package IntroducaoJava;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int h,min,seg,segTotais; 
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nSegundos totais?");
		segTotais = leia.nextInt();

		h = segTotais/3600;
		min = (segTotais%3600)/60;
		seg = (segTotais%3600)%60;
 		
 		
		System.out.println("\nO tempo de duração é de: "+ h+ " hora(s), "+ min+ " minuto(s) e "+ seg+ " segundo(s)"  );
	}

}
