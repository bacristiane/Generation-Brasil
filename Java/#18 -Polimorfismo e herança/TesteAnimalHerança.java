package ProgOrienObjeto;

public class TesteAnimalHeran�a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro cachorro1 = new Cachorro ("Cocada", 1,true, "Vira-lata",  
				"Pequeno", "Branca", false, true);
		Cavalo cavalo1 = new Cavalo ("Guerreiro", 5,true, "Puro-sangue",  
				"Grande", "Marrom", true, true, "Inglaterra");
		Pregui�a pregui�a1 = new Pregui�a ("Sid",1000,true,
				"Pregui�a Gigante", true, 100.78);
		
		cachorro1.imprimir();
		cavalo1.imprimir();
		pregui�a1.imprimir();
		
		
		
		
	}

}
