package basicsDEmo;
import java.util.Scanner;

public class ifelse {
	public static void main(String[] args) {
	int passingmarks,marksobtained;
	
	Scanner input=new Scanner(System.in) ;
	System.out.println("input marks scored by you");
	passingmarks=40;
	marksobtained=input.nextInt();
	
	if (marksobtained>=passingmarks){
		System.out.println("you have passed");
	}
	else{
		System.out.println("you have failed"); 
	}
	
}
}

