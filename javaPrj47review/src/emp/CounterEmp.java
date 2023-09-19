package emp;

import java.util.List;

import menu.Burger;

public class CounterEmp {

	// 버거 메뉴 소개
	public void showBurgerMenu(List<Burger> list) {
		// 모든 버거 메뉴 출력
		for(Burger burger : list) {
			System.out.println(burger);
			burger.setPrice(0);
		}

		
		
	}
	
	
}
