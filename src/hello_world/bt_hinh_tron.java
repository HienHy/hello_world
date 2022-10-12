package hello_world;

import java.util.Scanner;

public class bt_hinh_tron {
	public static void main(String[] args) {
		double r , dientich , chuvi ;
		Scanner sc =new Scanner(System.in);
		System.out.println("nhap ban kinh  r = ");
		r = sc.nextDouble();
		
		
		//tinh chu vi 
		chuvi = 2 * Math.PI * r;
		 System.out.println("chu vi = "+ chuvi);
		 
		 System.out.println("chu vi = " + Math.round(chuvi));
		 System.out.println("chu vi = " + Math.round(chuvi *100.0)/100.0);

		
		 
		 //tinh dien tich
		 
		 dientich = Math.PI * Math.pow(r, 2);
		 
		 System.out.println("dien tich = "+ dientich);
		 System.out.println("dien tich = " + Math.round(dientich));
		 System.out.println("dien tich = " + Math.round(dientich*100.0)/100.0);


	}
	

}
