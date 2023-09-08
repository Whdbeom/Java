package mob;

import java.util.Arrays;
import java.util.Scanner;

public class Pokemon {

	Scanner sc = new Scanner(System.in);
	
	// 멤버 변수
	private String name;
	private int hp;
	private int atk;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public Pokemon() {
		
	}
	
	public Pokemon(String name, int hp, int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		
	}
	
	
	// 멤버 메소드
	public void bodyAttack() {
		System.out.println(this.name + " 의 몸통박치기 !");
	}

	public String getFieldInfo() {
		return "Pokemon [name=" + name + ", hp=" + hp + ", atk=" + atk + "]";
	}
	
	Pokemon[] po = new Pokemon[1000];
	
	public void makePoke() {
		System.out.print("name : ");
		String name = sc.next();
		System.out.print("hp : ");
		int hp = sc.nextInt();
		System.out.print("atk : ");
		int atk = sc.nextInt();

		for(int i = 0; i < po.length; i++) {
			if(po[i] == null) {
			po[i] = new Pokemon();
			po[i].setName(name);
			po[i].setHp(hp);
			po[i].setAtk(atk);
				break;
			}
		}
	}
	
	public void pokeList() {
		for(int i = 0; i < po.length; i++) {
			if(po[i] != null) {
				System.out.println("name : " + po[i].getName() + "     hp : " + po[i].getHp() + "     atk : " +po[i].getAtk());
			} 
		}
	}

	public String toString() {
		return "Pokemon [sc=" + sc + ", name=" + name + ", hp=" + hp + ", atk=" + atk + ", po=" + Arrays.toString(po)
				+ "]";
	}
	
	
	
}
