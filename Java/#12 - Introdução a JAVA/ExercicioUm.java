package IntroducaoJava;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int idadeAno,idadeMes,idadeDias,idadeDiasA;
        Scanner leia = new Scanner(System.in); 
		
		
        System.out.println("\nQual a sua idade (anos):");
		idadeAno = leia.nextInt();

		System.out.println("\nQual a sua idade (mes):");
		idadeMes = leia.nextInt();

		System.out.println("\nQual a sua idade (dia):");
		idadeDias = leia.nextInt();


		idadeDiasA = (idadeAno*365)+(idadeMes*30)+idadeDias;
		
		
		System.out.println("\nSua idade em dias é: "+ idadeDiasA );

	}

}
