package basicsDEmo;
import java.util.Random;

public class randomnumber {

	public static int randInt(int min,int max){
		Random rand=new Random();
		int randomnum=rand.nextInt((max-min)+1)+min;
		return randomnum;
	}
	
}
/*public class randomnumber{
	public static void main(String[] args) {
	Random rand=new Random();
		int r=rand.nextInt(32);
		System.out.println("the random number is" +r);
	}
}*/
