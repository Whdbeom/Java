package data;

public class Lotto {

	public static int[] comNum = new int[6];
	public static int comBonusNum;
	public static int[] userNum = new int[6];
	public static int userBonusNum;
	private int lottonum = (int)(Math.random()*45+1);

	
	public int getLottonum() {
		return lottonum;
	}
	public void setLottonum(int lottonum) {
		this.lottonum = lottonum;
	}

	
}
