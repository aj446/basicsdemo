package basicsDEmo;
import java.util.Scanner;

class nestedifelse {
	public static void main(String[] args) {
		

	int marksobtained,passingmarks;
	char grade;
	passingmarks=40;
	Scanner input=new Scanner(System.in);
	System.out.println("marks obtained by you");
	marksobtained=input.nextInt();
	if(marksobtained>=passingmarks){
		if(marksobtained>90)
			grade='A';
		else if(marksobtained>75)
		grade='B';
		else if(marksobtained>60)
			grade='C';
		else
			grade='D';
		
		System.out.println("you have passed the exam and your grade is " + grade);
	}
		else{
			grade='F';
			System.out.println("you have failed the exam");
		}
		}
}
/*import java.util.Scanner;

class nestedifelse {
  public static void main(String[] args) {
    int marksObtained, passingMarks;
    char grade;
 
    passingMarks = 40;
 
    Scanner input = new Scanner(System.in);
 
    System.out.println("Input marks scored by you");
 
    marksObtained = input.nextInt();
 
    if (marksObtained >= passingMarks) {
 
      if (marksObtained > 90) 
        grade = 'A';
      else if (marksObtained > 75)
        grade = 'B';
      else if (marksObtained > 60)
        grade = 'C';
      else
        grade = 'D'; 
 
      System.out.println("You passed the exam and your grade is " + grade);
    }
    else {
      grade = 'F'; 
      System.out.println("You failed and your grade is " + grade);
    }
  }
}*/

	


