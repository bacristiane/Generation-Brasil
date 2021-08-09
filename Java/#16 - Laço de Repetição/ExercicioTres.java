package LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade=0,cont21=0,cont50=0;
		Scanner leia = new Scanner(System.in);
		
		
		
		while (idade != -99)
		{
			System.out.println("\nEntre com a idade: ");
			idade = leia.nextInt();
			
			if(idade >= 0 && idade<21)
			{
				cont21=cont21 +1;
			}
			if(idade > 50)
			{
				cont50 = cont50 +1;
			}
		}
		System.out.println("\n O total de pessoas com idade menos que 21 anos é de: "+cont21);
		System.out.println("\n O total de pessoas com idade mais que 50 anos é de: "+cont50);
	}

}
