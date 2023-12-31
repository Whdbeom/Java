package Manager;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

import lottoNum.LottoNum;
import test.Test;
import util.Scan;

public class GameManager {

	public static Scanner sc = new Scanner(System.in);
	LottoNum lottoNum = new LottoNum();
	Draw draw = new Draw();
	Scan scan = new Scan();
	public static Set<Integer> userNum;
	public static Set<Integer> comNum;
	
	public void gameStart() {
		System.out.println("⢠⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⡄⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤\r\n"
				+ "⢸⣿⣿⣿⣿⣿⣿⣛⣋⡻⠿⠿⠿⠿⠿⠿⠿⠿⠴⠿⠛⠛⠛⠛⠛⠛⠻⠿⢿⣿⣿⣽⣿⣿⣿⣿⠿⠏⢻⣿⣿⣿⣿⣿⣿⢁⣸⣯⣿⣿⣿⣯⣿⣿⣿⣿⣿⣿⣿⡿⢿⣿⣿⣁⣛\r\n"
				+ "⢸⣿⣯⣿⣿⣿⡿⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢻⣿⣿⣿⣿⣿⣿⣦⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⢿⣿⣿⣿⣿⣿⣟⣿⣿⣿⣽⣿⣿⣿⣿⣿\r\n"
				+ "⢸⣿⣿⣿⣿⣿⠁⠀⢀⠀⠀⢀⡀⢀⡀⠀⡀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠉⠀⠀⠀⠀⠀⠀⠀⠉⠹⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
				+ "⢸⣿⣿⣿⡏⠀⠀⠀⢸⠶⠶⢾⣏⣹⡇⠀⡇⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠿⢿⣇⣸⣿⠋\r\n"
				+ "⢸⣿⣿⣿⠀⠀⠀⠀⠈⣉⣉⣉⣁⣸⡇⠀⠉⠉⠉⠉⠁⠻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⡿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢹⣿⣿\r\n"
				+ "⢸⣿⣿⠋⠀⠀⠀⠀⠀⡖⠒⠒⠒⠚⠃⠀⢸⡏⠉⠉⠉⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿\r\n"
				+ "⢸⣿⣿⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠁⠀⠈⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉\r\n"
				+ "⢸⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⢸⣿⣿⠀⠀⠀⠀⠀⢸⠉⠉⠉⠀⢸⡧⠄⡇⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⠀⡇⠀⠀⠀⢠⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠀⠀⢀⡀⠀⠀⠀⠀\r\n"
				+ "⠸⠿⢹⠀⠀⠀⠀⠀⠘⣒⣒⣒⣂⣘⠁⠀⠛⠒⠒⠒⠂⠿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠙⠛⠛⠉⠉⣿⠀⣇⡀⠀⠀⢸⡇⠀⠀⠀⠠⠴⠆⠀⠀⠀⠸⣄⡀⣸⡇⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠘⣤⠀⠀⠀⠀⠀⡬⠭⠭⠭⠽⠇⠀⢰⡖⠒⠒⠒⣶⠀⠀⡀⠀⢀⠀⠀⠀⠀⠀⠀⠸⡆⠀⠀⠀⠀⠈⣆⠈⠳⠤⠤⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠋⠀⠀⠀⠀⣤\r\n"
				+ "⠀⠀⠀⠙⢇⠀⠀⠀⠀⠛⠛⠛⠛⠛⠀⠀⠈⠛⠛⠛⠛⠋⠀⠀⠁⠀⠘⠀⠀⠀⢠⠤⣄⣀⢳⡄⠀⠀⠀⠀⠹⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⠁\r\n"
				+ "⠀⠀⠀⠀⠀⠛⢤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⡏⠀⠀⠘⠛⠁⠀⠀⠀⠀⣀⡾⢇⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⠌⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠈⠛⠶⠶⣤⣤⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣤⡤⠞⠃⠀⠀⠀⠀⠀⠀⠀⠀⣴⠟⠁⠀⠀⣼⣧⣤⡔⢻⣍⠉⠉⠉⠙⢷⡀⠀⠀⣠⡄⠊⠁⠀⠀⠛⣦\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠟⠁⠀⢠⠐⠚⢱⡞⠀⢈⣽⣿⡟⠀⠀⠀⠀⢻⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠃⠀⢠⠒⠁⠀⢰⠛⢳⡍⠙⢳⣤⣤⡄⠀⠀⠀⠘⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠏⠀⢰⠃⠀⠀⠀⢠⣾⠏⣯⣍⠉⠉⠉⠁⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠃⠀⢰⡟⠀⠀⠀⠀⠈⠁⠀⡏⠉⢦⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡟⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⣇⡀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠘⠁⠀⠀⠀⠀⠀⠀⠀⢹⡇⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡇⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡞⠀⠀⠘⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠻⡀⠀⠀⠀⠀⠀⠀⠀⢠⠟⠁⠀⠀⠀⠈⠛⠷⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠱⢦⣀⣀⣀⣴⠎⢹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢷⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⠖\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡨⠇⠀⠀⠀⠀⠀⠀⠀⢀⣤⠔⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠊⠁⠀⠀⠀⠀⠀⠀⠀⣴⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⠋⠀⠀⠀⠀⠀⠀⠀⢠⡴⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⢖⣒\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡜⠁⠀⠀⠀⠀⠀⠀⠀⠀⡜⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠤\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⣀⡤⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠤⢴⣗\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⠻⠤⠤⠤⠤⠤⠤⠤⠟⠣⣤⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀\r\n"
				+ "⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⢀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⠀\r\n"
				+ "⣿⣿⣿⣿⣿⣿⡿⠏⣻⣿⣿⣿⣿⣿⣿⣿⣿⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣹⣿⣿⣿⣿⣿⡏⢿⣿⣿⣿⣿⣿⣿⠉⣈⣿⣿⣿⣿⣏⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣉⡹⠀\r\n"
				+ "⣿⣿⣽⣿⣿⣿⣿⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣦⣾⣿⣿⣿⣿⣿⣿⣾⣿⠿⠿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣯⣾⣿⣿⣿⣿⠀\r\n"
				+ "⣿⣿⣿⣿⠿⠿⠿⠿⠷⠾⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣷⣤⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠁⠀⠀⠈⠉⠉⠉⠙⠻⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀\r\n"
				+ "⡟⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠙⠛⠛⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠙⠻⢿⣿⣹⣿⡟⠀\r\n"
				+ "⡇⠀⠤⣤⠤⢠⡄⡄⠀⢠⣀⣀⣠⡄⢠⠀⠀⠀⠀⠉⠙⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⢻⣿⣷⠀\r\n"
				+ "⡇⠀⠀⡇⠀⢸⡇⡇⠀⢸⣉⣉⣹⡇⢸⠓⠂⠀⠀⠀⠀⠀⠈⠙⢻⣿⣿⣿⣿⣿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⢿⠀\r\n"
				+ "⡇⠀⢠⢣⡄⢸⡟⡇⠀⠀⠤⠤⠤⠤⢤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⠿⣿⣿⣷⣬⣿⣿⣿⣿⣿⣿⣿⡟⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠀\r\n"
				+ "⡇⠀⠇⠀⠸⢸⡇⡇⠀⠀⣞⣉⣉⣉⣉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣿⣿⡿⣿⣿⣿⣿⣿⣿⡇⠀⡠⠎⢁⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⠿⣾⣿⣿⣿⣿⣿⣿⠀⢸⠁⢰⡇⢹⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡄⡎⢳⡀⠀⠀⠀⠀⠀\r\n"
				+ "⡇⠀⡰⠶⠶⡀⠀⡆⠀⠀⢠⡆⠀⢰⢰⠀⠀⠀⡰⠶⠶⠶⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢿⣿⣏⡉⢻⢸⡏⠀⠀⠀⡟⠁⠀⠀⠀⠀⣰⣦⠀⠀⠀⠸⢷⡉⢡⡇⠀⠀⠀⠀⠀\r\n"
				+ "⡇⠀⡇⠀⠀⡇⠀⡇⠀⠀⡏⢱⠉⢹⢸⠀⠀⣤⣬⣭⣭⣭⣥⡄⠀⠀⠀⠀⢰⡖⠚⠋⠉⠉⠁⠀⠀⠀⠈⡎⠁⠀⢀⣼⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠀⠀⠀⠀⢠⠀\r\n"
				+ "⡇⠀⠈⠉⠉⠀⠀⡇⠀⠈⢠⣤⣥⣬⡜⠀⠀⠀⠒⠒⠒⠒⣲⠀⠀⠀⠀⠀⠈⠉⠙⠓⣤⡀⠀⠀⠀⠀⠀⢹⡗⠒⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡎⠀\r\n"
				+ "⡇⠀⢸⣤⣤⣤⣤⡄⠀⠀⠣⣤⣤⣤⡜⠀⠀⠀⣯⣭⣭⣭⣭⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠓⣶⣤⣀⠀⢀⣸⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡔⠁⠀⠀\r\n"
				+ "⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠹⣏⡁⠈⢱⣦⣀⡠⢖⣒⠒⠒⠒⠒⢦⡀⠀⠀⢀⡠⠤⠊⠁⠀⠲⢦⠀\r\n"
				+ "⡇⠀⡄⠀⠀⠀⠀⡄⠀⠀⠤⠤⠤⠤⢤⠀⠀⣤⠤⠤⢤⠀⢠⠀⠀⢀⡠⠤⠤⠤⡀⠀⠀⠀⠀⠀⡄⠀⠀⠹⢧⠴⢯⡽⠉⠑⣺⣿⡶⠀⠀⠀⠀⢿⡖⠒⠊⠀⠀⠀⠀⠀⠀⠈⠀\r\n"
				+ "⡇⠀⣇⣀⣀⣀⡀⡟⠃⠀⡤⠤⠤⠤⠼⠀⠀⣿⣀⣀⣸⠛⢻⠀⢀⣀⣘⣛⣛⣛⣀⡀⠀⣀⡠⠊⠘⢄⣀⠀⢸⢠⡾⢧⡛⠻⢿⣄⣀⣀⠀⠀⠀⠸⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⡇⠀⠠⠤⠤⠤⠤⡄⠀⠀⠷⠤⢤⡤⠤⠀⠀⠀⣀⣀⣀⣀⣘⠀⠀⠠⠤⠤⠤⠤⡄⠀  ⢀⣀⣀⣀⣀⣀⣀⠀⢸⢀⣰⡟⣟⣛⠛⠛⠛⠋⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⡇⠀⢸⣋⣛⣛⣛⡁⠀⠠⠤⠤⠾⠷⠤⠤⠀⠀⠀⠀⠀⠀⢸⠀⠀⢸⣏⣉⣉⣉⡁⠀⠀⠀  ⠀⠀⡇⠀⠀⠀⢸⠈⠉⠀⡟⠙⣄⡀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⡇⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⡇⠀⢠⣤⣤⠀⠀⡄⠀⢠⣤⣤⢀⡀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⠀⠀⠀⢹⡇⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⡇⠀⡇⠀⠀⡇⠀⡇⠀⠀⠀⢸⢸⡇⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⡎⠁⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⡇⠀⠈⠉⠉⡀⠀⠇⠀⠀⢀⡜⢸⡗⢺⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡸⠇⠀⢀⡼⠁⠀⠸⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⡇⠀⢀⡀⠤⠣⠤⣀⠀⠠⠊⠁⢸⡇⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⢠⡼⠃⠀⠀⠀⠈⠛⠶⢄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⡇⠀⠈⠁⠀⠀⠀⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣧⡤⢺⡇⠀⠀⠀⠀⠀⠀⠀⠈⠛⢦⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⡠⠀\r\n"
				+ "⡇⠀⢀⡀⠀⢀⡀⡀⠀⠀⣀⣀⣀⣀⣀⠀⠀⠀⢀⠀⠀⡀⢀⠀⠀⠀⢀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠉⠁⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠀⠀\r\n"
				+ "⡇⠤⠤⠤⠤⢸⡇⡇⠀⠀⠀⢀⠜⠣⡀⠀⠀⠀⢸⠀⠀⡇⢸⠀⠀⢠⡄⠀⠀⠘⡄⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⢘⡇⠀⠀⠀⠀⠀⠀⠀⠀⣀⡠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⡇⠀⡜⢣⡄⢸⡷⡇⠀⠀⠘⠁⠀⠀⠈⠀⠀⠀⡾⣀⠛⡇⢸⠀⠀⠀⠠⠤⠤⢌⠀⠀⠀⠀⠀⠀⠀⠀⢸⢀⡔⠁⠀⠀⠀⠀⠀⠀⠀⣀⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⡇⠀⢇⡸⠃⢸⡇⡇⠀⠈⠉⠉⢹⡏⠉⠉⠀⣴⠁⠉⡄⡇⢸⠀⢀⣀⣤⣀⣀⣼⣀⡀⢀⠀⠀⣀⠀⣸⣧⠟⠁⠀⠀⠀⠀⠀⠀⠀⣠⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣶⠶⠀\r\n"
				+ "⣧⠀⠀⠀⠀⠈⠁⠁⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠁⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠉⢰⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⢀⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢉⠀\r\n"
				+ "⠈⠿⣦⣤⣤⣤⣤⣤⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣠⡶⢿⣅⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣀⣠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠤⢤⣶⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠀⠀⠙⠷⠶⠦⠤⠤⠤⠤⠤⠤⠼⠯⣭⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣉⠀");

		boolean select = true;
		int x = 0;
		while(select) {
			System.out.println("===============로또===============");
			System.out.println("자동 또는 수동을 선택하세요");
			System.out.println("1.자동 2.수동");
			System.out.println("=================================");
//			try {
//			x = sc.nextInt();
//			} catch(InputMismatchException e) {
//				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
//				sc.nextLine();
//				continue;
//			}
			x = scan.scan();
			switch(x) {
			case 1 : 
				System.out.println("자동을 선택하셨습니다.");
				auto(); 
				select = false; break;
			case 2 : 
				System.out.println("수동을 선택하셨습니다.");
				manual(); 
				select = false; break;
			default :
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
				continue;
			}
		}
	}


	private void manual() {
		System.out.println("=================================");
//		lottoNum.selectNum();
		userNum = lottoNum.selectNum();
		System.out.println("선택된 숫자 : " + userNum);
		startDraw();
	}


	private void auto() {
		System.out.println("=================================");
		userNum = lottoNum.generateNum();
		System.out.println("자동 선택된 번호 : " + userNum);
		startDraw();
	}
	
	private void startDraw() {
		System.out.println("추첨을 시작하시려면 아무 키나 눌러주세요");
		String x = sc.next();
		if(x != null) {
			draw.startDraw();		
			}
		}
	
//	public void reGame(String x) {
//		if(x == "y") {
//			gameStart();
//		} else if(x == "n") {
//			System.out.println("게임을 종료합니다.");			
//		}		
//	}

	
	}
	
	

