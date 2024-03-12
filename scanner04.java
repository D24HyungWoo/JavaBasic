
package Scanner;

import java.util.Scanner;
//import는 가장 앞에 있어야 함

public class scanner04{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("변수 a에 넣을 숫자 입력 : ");
		int a = input.nextInt();
		System.out.print("변수 b에 넣을 숫자 입력 : ");
		int b = input.nextInt();
		int c;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("변수 a의 값 = " + a);
		System.out.print("변수 b의 값 = " + b);
	
	}
}
