package basicsDEmo;
import java.util.Scanner;

public class inputfromuser {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
int a;
float b;
String s;
System.out.println("enter the string");
s=input.next();
System.out.println("the string entered is"+s);
System.out.println("Enter the float");
b=input.nextFloat();
System.out.println("the number you entered is"+b);

}
}
