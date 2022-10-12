package hello_world;

import java.util.Scanner;

public class lop_math {
public static void main(String[] args) {
	double a,b;
	Scanner sc = new Scanner(System.in);
	System.out.println("nhap vao so a");
	a = sc.nextDouble();
	System.out.println("nhap vao b");
	b = sc.nextDouble();
	
	
	//ham tri tuyet doi
	System.out.println("|a| = "+ Math.abs(a));
	
	
	//ham tim min
	
	System.out.println("min (a,b)=" + Math.min(a, b));
	
	//ham tim max
	System.out.println("max (a,b)=" + Math.max(a, b));

	
	//ham ceil
	System.out.println("ceil(a)" + Math.ceil(a));
	
	//ham floor
	System.out.println("floor (a)=" + Math.floor(a));

	//ham sqrt can bac 2
	System.out.println("sqrrt (a)=" + Math.sqrt(a));

	
	//ham tinh so mu
	System.out.println("pow (a,b)=" + Math.pow(a, b));

	

}
}