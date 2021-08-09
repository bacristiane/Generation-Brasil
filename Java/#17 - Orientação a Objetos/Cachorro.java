package ProgOrienObjeto;

public class Cachorro extends Animal {

	private String ra�a;
	private String porte;
	private String cor;
	private boolean competi��o;
	private boolean corrida;
	
	
	public Cachorro (String nome, int idade,boolean som, String ra�a, 
			String porte, String cor, boolean competi��o, boolean corrida)
	{
		super(nome, idade,som);
		setRa�a(ra�a);
		setPorte(porte);
		setCompeti��o(competi��o);
		setCorrida(corrida);
	}
	
	public void imprimir ()
	{
		System.out.println(
				"\nNome: " + getNome()
				+ "\nIdade: " + getIdade()
				+ "\nEmite Som? " + isSom()
				+ "\nRa�a: " + getRa�a()
				+ "\nPorte:" + getPorte()
				+ "\nCompete?" + isCompeti��o()
				+ "\nCorre?" + isCorrida()
				);

	}
	
	public boolean isCorrida() {
		return corrida;
	}

	public void setCorrida(boolean corrida) {
		this.corrida = corrida;
	}

	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isCompeti��o() {
		return competi��o;
	}

	public void setCompeti��o(boolean competi��o) {
		this.competi��o = competi��o;
	}
	
}
