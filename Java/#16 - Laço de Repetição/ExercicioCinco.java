package LacosDeRepeticao;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero,soma=0;
		Scanner leia = new Scanner(System.in);
			
		do 
		{
			System.out.println("\nEntre com o numero: ");
			numero = leia.nextInt();
			
			soma=soma+numero;
			
		} while (numero != 0);
			
			System.out.println("\nA soma dos números é: "+soma);
	}

}
