package exerciciosGuanabara;

public class ContaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta c1 = new Conta(10, true);
		
		
		c1.setNumConta(1111);
		c1.setNomeDono("Barbara");
		
		/*c1.abrirConta("cp");
		c1.depositar(100);
		c1.sacar(330);
		c1.sacar(250);
		c1.fecharConta();
		*/
		
		
		c1.estadoAtual();
		
	}

}
