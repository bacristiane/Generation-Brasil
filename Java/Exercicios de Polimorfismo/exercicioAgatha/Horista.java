package exercicioAgatha;

public class Horista extends Funcionario  {
	
	public Horista (String nome,String cpf, int anoNasc, int horasTrab, double salario) {
		super(null, null, 0, 0, 50.0);
	}

	@Override
	public  double Pagamento () {
		// TODO Auto-generated method stub
		
		double pagamento = this.getSalario()*this.getHorasTrab();
		return pagamento;
		
	}


}

