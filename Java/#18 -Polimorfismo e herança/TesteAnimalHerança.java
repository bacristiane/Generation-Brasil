package ProgOrienObjeto;

public class TesteAnimalHerança {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro cachorro1 = new Cachorro ("Cocada", 1,true, "Vira-lata",  
				"Pequeno", "Branca", false, true);
		Cavalo cavalo1 = new Cavalo ("Guerreiro", 5,true, "Puro-sangue",  
				"Grande", "Marrom", true, true, "Inglaterra");
		Preguiça preguiça1 = new Preguiça ("Sid",1000,true,
				"Preguiça Gigante", true, 100.78);
		
		cachorro1.imprimir();
		cavalo1.imprimir();
		preguiça1.imprimir();
		
		
		
		
	}

}
