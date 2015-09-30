
public class staticmethods {
public static void main(String[] args) {
	display();
	staticmethods s=new staticmethods();
	s.show();
}
static void display(){
	System.out.println("Static method  is called first and you need not to create any object for it");
}
void show(){
	System.out.println("for this method to be called object has to be created");
}
}
