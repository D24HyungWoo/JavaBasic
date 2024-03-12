package Scanner;

import java.util.Scanner;
//import는 가장 앞에 있어야 함

public class scanner05{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("금액을 입력하세요(원) : ");
		int a = input.nextInt();
		int x = a/500;
	    int y = (a%500)/100;
		
		System.out.print("500원 동전 " + x + "개와 100원 동전 " + y + "개가 필요합니다.");
	}
	}