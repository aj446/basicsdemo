
public class factorial {
public static void main(String[] args) {
	int j=3;
	//final int factnum=100;
	//for(int i=0;i<factnum;i++)
	System.out.println(j +"! is " + factorial(j) );
}
public static int factorial (int n){
	int result=1;
	for(int i=2;i<=n;i++)
	{
		result=result*i;
	}
	return result;
}
}
