package basicsDEmo;
import java.util.Scanner;

/*public class mulitiplication {
	public static void main(String[] args) {
int n,c;
System.out.println("enter the number to find its multiplication table");
Scanner input=new Scanner(System.in);
n=input.nextInt();
System.out.println("the table for n is");
for(c=0;c<=10;c++){
	System.out.println(n+"*"+c+"="+n*c);
}
	
}
}*/
public class multiplication{
	public static void main(String[] args) {
		int a,b,c,d;
		Scanner input=new Scanner(System.in);
		System.out.println("enter your two values");
		a=input.nextInt();
		b=input.nextInt();
		for(c=a;c<=b;c++){
			for (d=0;d<c;d++){
				System.out.println(+c+"*"+d+"="+c*d);
			}
		}
		
	}
}
