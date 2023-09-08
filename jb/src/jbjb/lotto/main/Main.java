package jbjb.lotto.main;



public class Main {
	private static int[] lottoNum;
	private static int[] winNum;
	private static int[] userNum;
	
	public static int[] getLottoNum() {
		return lottoNum;
	}
	public static void setLottoNum(int[] lottoNum) {
		Main.lottoNum = lottoNum;
	}
	public static int[] getWinNum() {
		return winNum;
	}
	public static void setWinNum(int[] winNum) {
		Main.winNum = winNum;
	}
	public static int[] getUserNum() {
		return userNum;
	}
	public static void setUserNum(int[] userNum) {
		Main.userNum = userNum;
	}
	public static void main(String[] args) {
		
		lottoNum = new int[45];
		winNum = new int[6];
		userNum = new int[6];
		
		
	}

}
