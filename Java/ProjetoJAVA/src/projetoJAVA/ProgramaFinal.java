package projetoJAVA;

import java.util.Scanner;

public class ProgramaFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op = 0;
	    double valorTotal=0.0;
	    int contB=0;
	    
	    Scanner input = new Scanner (System.in);
		 
		Beneficiaries benef = new Beneficiaries (null, null, null, null,0);
		Doadores doad = new Doadores (null, null, null, null,0);
		
		
				
		 do 
			{
			
			System.out.println("\n\t\tMenu de Opções");
			System.out.println("--------------------------------------------");
			System.out.println("\n\t\tCadastros");
			System.out.println("\n(1) Cadastro: Doadore"
					+ "\n(2) Cadastro: Benificiare");
			System.out.println("--------------------------------------------");
			System.out.println("\n\t\tRelatórios");
			System.out.println("\n(3) Total arrecadado"
					+ "\n(4) Quantidade de beneficiaries");
			System.out.println("--------------------------------------------");
			System.out.println("\n(5) Encerrar o programa");
			System.out.println("--------------------------------------------");
			System.out.println("\n\t\tDigite uma opção: ");
			op = input.nextInt();
			
			if (op==1)
			{
			
				doad.cadastrar();
				
			}
			else if (op==2)
			{
				benef.cadastrar();
				benef.distribuir();
				if (benef.getRenda()<=1000.00)
				{
					contB++;	
				}	
			}
			else if (op==3)
			{
			    
			    System.out.println("O total doado foi :"+ doad.getSaldo());
			}
			else if (op==4)
			{
				
				System.out.println("A quantidade de pessoas a serem beneficiadas é :"+ contB);
				
			}
			else
			{
				System.out.println("\nPrograma encerrado. Até logo! ");
			}
			
			}
			while(op!=5);
		
		
         }
			
	}

