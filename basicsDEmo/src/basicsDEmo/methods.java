package basicsDEmo;

public class methods {
	methods(){
		System.out.println("Cnstrictor is called when an object is created no need to call the object");
	}
	static void staticmethod(){
		System.out.println("Static method is called without creating an object");
	}
	void nonstaticmethod(){
		System.out.println("non-static method is called only when object is created");
	}
	
public static void main(String[] args) {
	staticmethod();
	methods object=new methods();
	object.nonstaticmethod();
}
}
