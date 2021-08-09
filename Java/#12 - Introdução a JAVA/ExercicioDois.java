package IntroducaoJava;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ano,mes,dias,diasVivido;
		Scanner leia = new Scanner(System.in);

		System.out.println("\nDias totais vividos?");
		diasVivido = leia.nextInt();

		ano = diasVivido/365;
		mes = (diasVivido%365)/30;
		dias = (diasVivido%365)%30;
 		
 		
		System.out.println("\nSua idade é de: "+ ano+ " ano(s), "+ mes+ " mes(es) e "+ dias+ " dia(s)");
	}

}
