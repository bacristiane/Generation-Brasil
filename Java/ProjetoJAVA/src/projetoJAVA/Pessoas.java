package projetoJAVA;

public abstract class Pessoas {
	
	
	protected String nome;
	protected String cpf_cpnj;
	protected String telefone;
	protected String email;

	// Método Construtor
	public Pessoas (String nome,String cpf_cpnj, 
			String telefone, String email)
	{
		super();
		setNome(nome);
		setCpf_cpnj(cpf_cpnj);
		setTelefone(telefone);
		setEmail(email);
					
	}
	
	//Métodos Pollimorficos
	public void cadastrar()
	{
		
	}
	public void listar()
	{
		
	}
	// Métodos Assessores


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf_cpnj() {
		return cpf_cpnj;
	}

	public void setCpf_cpnj(String cpf_cpnj) {
		this.cpf_cpnj = cpf_cpnj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
