package La�osDeDecisao;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com A: ");
		a = leia.nextInt();
		System.out.println("\nEntre com B: ");
		b = leia.nextInt();
		System.out.println("\nEntre com C: ");
		c = leia.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("\nO n�mero maior �: "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("\nO n�mero maior �: "+b);
		}
		else
		{
			System.out.println("\nO n�mero maior �: "+c);
		}



	}

}
