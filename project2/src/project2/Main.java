package project2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		div div = new div();
<<<<<<< HEAD
		plus p = new plus();
		multi m = new multi();
		
=======
		plus plus = new plus();
>>>>>>> 98c05b758854036fc788d2c30f5af55e3e4f450b
		Scanner sc = new Scanner(System.in);
		System.out.printf("number 1 :");
		int num1 =  sc.nextInt();
		System.out.printf("number 2 :");
		int num2 =  sc.nextInt();

		div.diveNum(num1, num2);
<<<<<<< HEAD
		p.plusNum(num1,num2);
		m.multiNum(num1, num2);
=======
		plus.plus(num1, num2);
>>>>>>> 98c05b758854036fc788d2c30f5af55e3e4f450b
		//

	}

}
