package basicsDEmo;

public class staticblock {
public static void main(String[] args) {
	System.out.println("main method is executed here");
}
static{
	String os=System.getenv("OS");
	if(os.equals("Windows_NT")!=true){
		System.exit(1);
	}
}
}
/*static{
	System.out.println("Static block is executeed before main method");
}
}*/

