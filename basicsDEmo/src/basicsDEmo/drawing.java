package basicsDEmo;
public class drawing {
private shape shape;
public void setShape(shape shape) {
	this.shape = shape;
}
public void drawShape()
{
	this.shape.draw();
}
public static void main(String[] args) {
	drawing d =new drawing();
	d.drawShape();
}
}