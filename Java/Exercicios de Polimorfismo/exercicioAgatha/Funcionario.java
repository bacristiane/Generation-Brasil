package exercicioAgatha;

public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private int anoNasc;
	private int horasTrab;
	private double salario;
	
	
	public Funcionario
	(String nome, String cpf, int anoNasc, int horasTrab, double salario)
	{
		super();
		setNome(nome);
		setCpf(cpf);
		setAnoNasc(anoNasc);
		setHorasTrab(horasTrab);
		setSalario(salario);
					
	}
	
	
	public abstract double Pagamento ();
	
	public int getIdade () {
		int idade = 2021 - this.getAnoNasc();
		return idade;
	}
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getAnoNasc() {
		return anoNasc;
	}
	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	public int getHorasTrab() {
		return horasTrab;
	}
	public void setHorasTrab(int horasTrab) {
		this.horasTrab = horasTrab;
	}
	public double getSalario() {
		return salario;
	}
	
    public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
