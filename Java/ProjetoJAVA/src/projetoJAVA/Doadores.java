package projetoJAVA;

import java.util.Scanner;

public class Doadores extends Pessoas  {
	
	//Atributos
	
	public float doacao;
	public float saldo;
	
	//Variaveis
	
	double valorTotal=0.0;
	Scanner input = new Scanner (System.in);
	
	
	//Método Construtor
	public Doadores(String nome, String cpf_cpnj, String telefone, String email, float renda) {
		super(null, null, null, null);
		setDoacao(0);
		setSaldo(0);
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
			//System.out.println("Valor Doado (R$) - valor mínimo R$ 20,00: ");
			//this.setDoacao(input.nextFloat());
			System.out.println("Valor Doado (R$) - valor mínimo R$ 20,00: ");
			this.arrecadacao(input.nextFloat());
			
		   
		}
	
		public void arrecadacao(float doacao)
		{
		
		this.setSaldo(this.getSaldo()+doacao);
					
		}
		public float getDoacao() {
			return doacao;
		}
		public void setDoacao(float doacao) {
			this.doacao = doacao;
		}
		public float getSaldo() {
			return saldo;
		}

		public void setSaldo(float saldo) {
			this.saldo = saldo;
		}
	
				
}

