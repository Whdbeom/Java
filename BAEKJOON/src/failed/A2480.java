package failed;

import java.util.Scanner;

public class A2480 {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();   
    int b = sc.nextInt();
    int c = sc.nextInt();

    int money = 0;

    if(a == b && a == c) {
        money = 10000+(a*1000);
    } else if(a == b && b != c && a != c) {
        money = 1000 + (a*100);
    } else if(a !=b && b == c && a != c) {
        money = 1000 + (b*100);
    } else if(a == c && a != c && b != c) {
        money = 1000 + (c*100);
    } else {
        if(a > b && a > c) {                
            money = a*100;
        } else if(b > c && b > a) {
            money = b*100;
        } else if(c > a && c > b){
            money = c*100;
        }
    }
    System.out.println(money);
}
}