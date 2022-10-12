package hello_world;

import java.util.Scanner;

public class giai_pt_bac_nhat {
	public static void main(String[] args) {
		// ptbn ; ax+b = 0
		/*
		 * neu a = 0
		 *     neu b = 0 =>PT vo so nghiem
		 *     neu b ! 0 => Pt vo nghiem 
		 * neu a # 0 
		 *     co nghiem x = -b/a
		 *     
		 */
	double a, b ,x;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("nhap a = ");
	a = sc.nextDouble();
	System.out.println("nhap b = ");
	b = sc.nextDouble();
	
	
	if(a == 0) {
		if (b == 0) {
			System.out.println("pt vo so nghiem");
			
		}else {
			System.out.println("pt vo nghiem");
		}
		
	}else {
		x = -b/a;
		System.out.println("nghiem cua phuong trinh = "+x);
		
	}
	
	
	
	}
	

}
