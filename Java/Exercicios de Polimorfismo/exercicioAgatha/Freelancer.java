package exercicioAgatha;

public class Freelancer extends Funcionario {
	
	private int cargaHorariaF;
	
	public Freelancer (String nome,String cpf, int anoNasc, int horasTrab, double salario, int cargaHorariaM) {
		super(null, null, 0, 0, 300.0);
		setCargaHorariaF(0);
	}

	public int getCargaHorariaF() {
		return cargaHorariaF;
	}

	public void setCargaHorariaF(int cargaHorariaF) {
		this.cargaHorariaF = cargaHorariaF;
	}

	@Override
	public  double Pagamento () {
		// TODO Auto-generated method stub
		int horasExtras = this.getHorasTrab()-this.getCargaHorariaF();
		double pagamento = this.getSalario() + (((this.getSalario()*this.getCargaHorariaF())*1.5)*horasExtras);		
		return pagamento;
		
	}
	public  int horasExtras () {
		int horasExtras = this.getHorasTrab()-this.getCargaHorariaF();
		return horasExtras;
			
		}

}
