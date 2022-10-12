package hello_world;

import java.util.Scanner;

public class switch_case {
	public static void main(String[] args) {
		int n;
		Scanner sc =new Scanner(System.in);
		System.out.println("nhap vao thu ");
		n = sc.nextInt();
		
		switch (n) {
		case 2:
			System.out.println("hom nay la thu 2 ");
			break;
		case 3:
			System.out.println("hom nay la thu  3");
			break;
		case 4:
			System.out.println("hom nay la thu  4");
			break;
		case 5:
			System.out.println("hom nay la thu  5");
			break;
		case 6:
			System.out.println("hom nay la thu  6");
			break;
		case 7:
			System.out.println("hom nay la thu  7");
			break;
		case 8:
			System.out.println("hom nay la chu nhat");
			break;
			

		default:
			System.out.println("nhap sai1");
			break;
		}
	}

}
