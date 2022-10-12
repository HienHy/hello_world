package hello_world;

import java.util.Scanner;

public class chuyenThapPhanSangNhiPhan {

public static void main(String[] args) {
	int n ;
	Scanner sc = new Scanner(System.in);
	System.out.println("nhap vao so nguyen n >0");
	n = sc.nextInt();
	
	String nhiPhan = "";
	while (n>0) {
		nhiPhan = (n%2) + nhiPhan;
		n = n/2;
	}
	System.out.println("so he nhi phan là " +nhiPhan);
}
	

}
