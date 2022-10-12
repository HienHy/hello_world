package hello_world;

import java.util.Scanner;

public class phep_toan {
public static void main(String[] args) {
	//khai báo biến
	
	int a,b;
	
	// nhập dữ liệu

Scanner xt = new Scanner(System.in);
	
	System.out.println("nhập vào a = ");
	a = xt.nextInt();
	System.out.println("nhập vào b = ");
	b = xt.nextInt();
	
	
	int tong = a+ b;
	System.out.println("tong = "+ tong);
	
	int hieu = a- b;
	System.out.println("hieu = "+ hieu);
	
	
	
	int nhan = a* b;
	System.out.println("tich = "+ nhan);  
	
	
	
	float chia = (float)a/ b;
	System.out.println("thuong = "+ chia);
	
	int chailaydu = a % b;
	System.out.println("chia lay du = "+ chailaydu);
	
	
	
}
}
