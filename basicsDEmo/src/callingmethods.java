
public class callingmethods {
public static void main(String[] args) {
	printone();
	printtwo();
}
public static void printone(){
	System.out.println("the value of one is one");
}
public static void printtwo(){
	printone();
	printone();
}
}
