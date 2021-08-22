package exercicioAgatha;

public class Mensalista extends Funcionario  {
	
	private int cargaHorariaM;
	
	public Mensalista (String nome,String cpf, int anoNasc, int horasTrab, double salario, int cargaHorariaM) {
		super(null, null, 0, 0, 1000.0);
		setCargaHorariaM(0);
	}
	
	

	public int getCargaHorariaM() {
		return cargaHorariaM;
	}

	public void setCargaHorariaM(int cargaHorariaM) {
		this.cargaHorariaM = cargaHorariaM;
	}
	@Override
	public  double Pagamento () {
		// TODO Auto-generated method stub
		
		double pagamento = this.getSalario() + (((this.getSalario()*this.getCargaHorariaM())*1.5)*this.getHorasTrab());		
		return pagamento;
		
	}
	public  int horasExtras () {
	int horasExtras = this.getHorasTrab()-this.getCargaHorariaM();
	return horasExtras;
		
	}


}
