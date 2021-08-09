package exerciciosGuanabara;

public class Conta {

	// Atributos
	public int numConta;
	protected String tipo; //tipo da conta: Conta Corrente (cc) ou Conta Poupança (cp)
	private String nomeDono;
	private float saldo;
	private boolean status;
	
	
	public void estadoAtual()
	{
		System.out.println("_____________________");
		System.out.println("Conta: "+this.getNumConta());
		System.out.println("Tipo: "+this.getTipo());
		System.out.println("Dono: "+this.getNomeDono());
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Status: "+this.isStatus());
		
	}
	//Método Construtor
	public Conta ( float s, boolean sta)
	{
		this.setSaldo(s);
		this.setStatus(sta);
	}
	
	//Métodos Getters e Setters
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	//Métodos Personalizados
	public void abrirConta (String tipo)
	
	{
		this.setTipo(tipo);
		this.setStatus(true);
		
		if (tipo == "cc")
		{
			this.setSaldo(50);
		}
		else if (tipo == "cp")
		{
			this.setSaldo(150);
		}
		
		
	}
	public void fecharConta ()
	
	{
		if (this.getSaldo() > 0)
		{
			System.out.println("Conta tem saldo, não podemos fechá-la");	
		}
		else if (getSaldo() <0)
		{
			System.out.println("Conta com saldo negativo, não podemos fechá-la");
		}
		else
		{
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
	}
	public void depositar (float v)
	
	{
		if (this.isStatus() == true)
		{
			this.setSaldo(this.getSaldo()+v);
			System.out.println("Deposito realizado com sucesso na conta de "+this.getNomeDono());
		}
		else
		{
			System.out.println("ERRO: Impossével depositar");
		}
			
	}
	public void sacar (float v)
	
	{
	if (this.isStatus() == true && this.getSaldo() >= v)
	{
		this.setSaldo(this.getSaldo()-v);
	}
	else
	{
		System.out.println("ERRO: Impossível sacar");
	}
	}
	public void pagarMensal ()
	
	{
	
		int v = 0;
		
		if (this.getTipo() == "cc")
		{
			v = 12;
		}
		else if (this.getTipo() == "cp")
		{
			v = 20;
		}
		if (this.isStatus() == true && this.getSaldo() > v)
		{
			this.setSaldo(this.getSaldo()-v);
		}
		else
		{
			System.out.println("ERRO: Impossível pagar mensalidade ");	
		}
	}	
	
}
