package basicsDEmo;
import java.util.Scanner;

public class ftoc {
public static void main(String[] args) {
	float f, c;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value in degrees F");
	f=(float) s.nextDouble();
	c=(f-32)*5/9;
	System.out.println("the value in degrees c is   "  +c);
	
}
}
