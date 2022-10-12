package hello_world;

import java.util.Scanner;

public class PtBacHai {
	public static void main(String[] args) {
		/*
		 * ptb2 : ax^2 + bx + c = 0 cac bien can co :a,b,c,x1,x2,delta b delta = b^2 -
		 * 4ac kiem tra delta delta < 0 >> phuong trinh vo nghiem delta ==0 >> phuong
		 * trinh co nghiem kep x1= x2 = -b/2a delta > 0 >> phuong trinh co 2 nghiem x1 =
		 * (-b - sqrt(delta))/(2a)) x2 = (-b + sqrt(delta))/(2a))
		 * 
		 */

		double a, b, c, x1, x2, delta;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao a =");
		a = sc.nextDouble();

		System.out.println("nhap vao b =");
		b = sc.nextDouble();

		System.out.println("nhap vao c =");
		c = sc.nextDouble();

		if (a == 0) {

			System.out.println("nhap du lieu sai ");
		} else {

			delta = Math.pow(b, 2) - 4 * a * c;

			if (delta < 0) {
				System.out.println("pt vo nghiem ");
			} else if (delta == 0) {
				x1 = x2 = -b / (2 * a);
				System.out.println("phuong trinh co nghiem kep x1 = x2 =" + x1);

			} else {
				x1 = (-b - Math.sqrt(delta)) / (2 * a);
				x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("nghiem cua pt la x1 =" + x1);
				System.out.println("nghiem cua pt la x2 =" + x2);

			}
		}

	}
}
