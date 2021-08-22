package exercicioAgatha;

import java.util.Scanner;

public class CadFuncionario {

	public static void main(String[] args) {
		
		Horista func1 = new Horista (null, null, 0, 0, 0.0);
		Mensalista func2 = new Mensalista (null, null, 0, 0, 0.0,0);
		Freelancer func3 = new Freelancer (null, null, 0, 0, 0.0,0);
		
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		
		System.out.print("\nNome: ");
		func1.setNome(input.next());
		System.out.print("\nCPF: ");
		func1.setCpf(input.next());
		System.out.print("\nAno de Nascimento: ");
		func1.setAnoNasc(input.nextInt());
		System.out.print("\nHoras Trabalhadas: ");
		func1.setHorasTrab(input.nextInt());
		
		
		func1.Pagamento();
		System.out.print("\nO valor do pagamento é de "+func1.Pagamento());
		
		func1.getIdade();
		System.out.print("\nA sua idade é "+func1.getIdade());
		
		System.out.print("\nNome: ");
		func2.setNome(input.next());
		System.out.print("\nCPF: ");
		func2.setCpf(input.next());
		System.out.print("\nAno de Nascimento: ");
		func2.setAnoNasc(input.nextInt());
		System.out.print("\nHoras Trabalhadas: ");
		func2.setHorasTrab(input.nextInt());
		System.out.print("\nCarga Horária: ");
		func2.setCargaHorariaM(input.nextInt());
		
		func2.Pagamento();
		System.out.print("\nO valor do pagamento é de "+func2.Pagamento());
		func2.getIdade();
		System.out.print("\nA sua idade é "+func2.getIdade());
		func2.horasExtras();
		System.out.print("\nA quantidade de horas extras é: "+func2.horasExtras());
		
		System.out.print("\nNome: ");
		func3.setNome(input.next());
		System.out.print("\nCPF: ");
		func3.setCpf(input.next());
		System.out.print("\nAno de Nascimento: ");
		func3.setAnoNasc(input.nextInt());
		System.out.print("\nHoras Trabalhadas: ");
		func3.setHorasTrab(input.nextInt());
		System.out.print("\nCarga Horária: ");
		func3.setCargaHorariaF(input.nextInt());
		
		func3.Pagamento();
		System.out.print("\nO valor do pagamento é de "+func3.Pagamento());
		func3.getIdade();
		System.out.print("\nA sua idade é "+func3.getIdade());
		func3.horasExtras();
		System.out.print("\nA quantidade de horas extras é: "+func3.horasExtras());
	}

}
