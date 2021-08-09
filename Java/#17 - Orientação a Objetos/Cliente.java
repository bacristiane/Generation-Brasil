package ProgOrienObjeto;

public class Cliente {
	
	public String nome;
	public String sobrenome;
	public int numCliente;
	public int idade;
	public String email;
	public boolean newsletter;
	public String respNews;
	
	//Método Construtor
	public Cliente (int numCliente, String nome, String sobrenome,String email, boolean newsletter)
	{
		this.setNumCliente(numCliente);
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setEmail(email);
		this.setNewsletter(newsletter);
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getNumCliente() {
		return numCliente;
	}

	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isNewsletter() {
		return newsletter;
	}

	public void setNewsletter(boolean newsletter) {
		this.newsletter = newsletter;
		
	}
	
	public String getRespNews() {
		
		if (this.isNewsletter()==true)
		{
			respNews = "sim";
		    
		}
		else
		{
			respNews = "não";
		}
		return respNews;
		
	}


	public void setRespNews(String respNews) {
		
			this.respNews = respNews;
		
		
	}
	
	


	public void fichaCliente ()
	{
		System.out.println("Num: "+this.getNumCliente());
		System.out.println("Nome: "+this.getNome());
		System.out.println("Sobrenome: "+this.getSobrenome());
		System.out.println("Email: "+this.getEmail());
		System.out.println("Aceita receber nesletter? "+this.getRespNews());
		
		
	}

}
