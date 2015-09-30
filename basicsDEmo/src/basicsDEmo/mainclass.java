package basicsDEmo;
public class mainclass{
	public  static void mymethod(shape shape){
		shape.draw();
	}
	
public static void main(String[] args) {
	shape shape=new triangle();

	mymethod(shape);
}
}

	
	






