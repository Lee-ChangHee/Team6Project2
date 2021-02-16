package project2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		div div = new div();

		plus p = new plus();
		multi m = new multi();
		Minus minus = new Minus();

		plus plus = new plus();

		Scanner sc = new Scanner(System.in);
		System.out.printf("number 1 :");
		int num1 =  sc.nextInt();
		System.out.printf("number 2 :");
		int num2 =  sc.nextInt();

		div.diveNum(num1, num2);
		minus.minusNum(num1, num2);
		p.plusNum(num1,num2);
		m.multiNum(num1, num2);

		plus.plus(num1, num2);

		//

	}

}
