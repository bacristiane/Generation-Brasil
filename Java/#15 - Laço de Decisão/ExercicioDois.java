package LaçosDeDecisao;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("\nA sua categoria é infantil");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("\nA sua categoria é juvenil");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("\nA sua categoria é adulto");
		}
		else
		{
			System.out.println("\nVocê não está em nenhuma categoria");
		}
		
		
	}

}
