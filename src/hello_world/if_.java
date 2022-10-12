package hello_world;

import java.util.Scanner;

public class if_ {
	public static void main(String[] args) {
		int n;
		Scanner sc =new Scanner(System.in);
		System.out.println("nhap so nguyen n");
		n = sc.nextInt();
		
		
		
		// kiem tra chan le
		if(n%2 == 0) {
			System.out.println("n la so chan = "+n);
		}else
		{
			System.out.println("n la so le = "+n);
		}
	}

}
