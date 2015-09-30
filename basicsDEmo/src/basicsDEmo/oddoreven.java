package basicsDEmo;
import java.util.Scanner;

public class oddoreven {
public static void main(String[] args) {
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("enter your number ");
	n=s.nextInt();
	if(n%2==0){
		System.out.println("number is even");
	}
	else{
		System.out.println("number is odd");
	}
	
	
}
}
