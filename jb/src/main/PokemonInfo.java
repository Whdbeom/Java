package main;

public class PokemonInfo {
	
	
	public static void pokemonList() {
		Main.p1 = new Pokemon();
		Main.p1.name = "피카츄";
		Main.p1.hp = 100;
		Main.p1.atk = 10;
		Main.p1.def = 1;
		
		Pokemon p2 = new Pokemon();
		p2.name = "파이리";
		p2.hp = 100;
		p2.atk = 20;
		p2.def =2 ;
		
		Pokemon p3 = new Pokemon();
		p3.name = "꼬부기";
		p3.hp = 100;
		p3.atk = 30;
		p3.def = 3;
		
		Pokemon p4 = new Pokemon();
		p4.name = "이상해씨";
		p4.hp = 4;
		p4.atk = 3;
		p4.def = 3;
	}
	
}
