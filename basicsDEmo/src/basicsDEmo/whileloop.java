package basicsDEmo;
/*import java.util.Scanner;

public class whileloop {
	public static void main(String[] args) {
		
int n;
Scanner input=new Scanner(System.in);
n=input.nextInt();
while(n!=0){
	System.out.println("you entered " +n);
	System.out.println("input an integer");
}
System.out.println("out of loop");

}
}*/
import java.util.Scanner;

class WhileLoop {
  public static void main(String[] args) {
    int n;
 
    Scanner input = new Scanner(System.in);
    System.out.println("Input an integer"); 
 
    while ((n = input.nextInt()) != 0) {
      System.out.println("You entered " + n);
      System.out.println("Input an integer");
    }
 
    System.out.println("Out of loop");
  }
}
