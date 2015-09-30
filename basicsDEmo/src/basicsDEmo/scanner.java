
package basicsDEmo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class scanner {
	public static void readfromfile(String  inputfile) throws FileNotFoundException{
		Scanner scnner=new Scanner( new File("inputfile.txt"));
		while(scnner.hasNext()){
			System.out.println(scnner.next() );
			scnner.close();
			
		}
		
	}
	public static void readfromstring(String InputString){
		Scanner scnner=new Scanner(InputString );
	while(scnner.hasNext()){
		System.out.println(scnner.next());
		scnner.close();
	}
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		scanner s=new scanner();
		s.readfromfile("inputfile.txt");
		s.readfromstring("this is the string that is to be displayed");
	
	

	}

	
}

