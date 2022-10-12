package hello_world;

import java.util.Scanner;

public class nhap_lieu {
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		
		System.out.println("nhập vào họ và tên");
		String hovaten = SC.nextLine();
		
		System.out.println("nhập vào mã sinh viên");
		long masv = SC.nextLong();
		
		System.out.println("nhập vào điểm thi");
		float diemthi = SC.nextFloat();
		
		System.out.println("-------");
		System.out.println(" Họ và tên "+ hovaten);

		System.out.println("Mã sinh viên " + masv);
		System.out.println("Điểm thi "+ diemthi);

		
		}

}
