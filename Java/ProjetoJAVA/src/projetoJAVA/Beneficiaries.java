package projetoJAVA;

import java.util.Scanner;

public class Beneficiaries extends Pessoas {
		

	//Atributos
	public float renda; // renda per capita familiar

	
	//Variaveis
	
	double valorRecebido;
	Scanner input = new Scanner (System.in);
	
	//Método Construtor
	public Beneficiaries(String nome, String cpf_cpnj, String telefone, String email, float renda) {
		super(null, null, null, null);
		setRenda(0);
	
	}
	@Override
	public void cadastrar()
	{
			
		System.out.print("\nNome: ");
		this.setNome(input.next());
		System.out.print("\nCPF: ");
		this.setCpf_cpnj(input.next());
		System.out.print("\nTelefone: ");
		this.setTelefone(input.next());
		System.out.print("\nEmail: ");
		this.setEmail(input.next());
		System.out.print("\nRenda per Capita Familiar: ");
		this.setRenda(input.nextFloat());
	   
	}
	public void distribuir()
	{
		
		if (this.getRenda()<= 550.00)
		{
		valorRecebido = 600.00;
		System.out.println("Valor a receber: "+ valorRecebido);
		}
		else if (this.getRenda()> 550.00 && this.getRenda()<= 1000.00)
		{
			valorRecebido = 300.00;
			System.out.println("Valor a receber: "+ valorRecebido);
		}
		else
		{
			valorRecebido = 0.00;
			System.out.println("Esta renda não atende os critérios para fazer parte do programa");
		}
	}
	
	public double getValorRecebido() {
		return valorRecebido;
	}
	public void imprimir()
	{
		System.out.println("A pessoa "+this.getNome()+" irá receber "+valorRecebido);
	}


	public float getRenda() {
		return renda;
	}

	public void setRenda(float renda) {
		this.renda = renda;
	}
	

}
