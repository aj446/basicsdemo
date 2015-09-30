package basicsDEmo;
import java.io.Console;
import java.util.Arrays;

public class arraydemo {

	public static void main(String[] args) {
		int[] randomarray;
		randomarray =new int[10];
		String[] str={"just ","random","quotes"};
		for(int i=0;i<randomarray.length;i++){
			randomarray[i]=i;
		System.out.print("|"+i+"");
	
			}
		System.out.println("|");
		int k=1;
		while(k<=42){System.out.print('-'); k++;}
		System.out.println();
		
	String[][] multiarray=new String[10][10];
	for(int i=0;i<multiarray.length;i++){
		for(int j=0;j<multiarray[i].length;j++){
			System.out.print(multiarray.length);
			multiarray[i][j]=+i+""+j;
			
			
		}
		
	}
	System.out.print("|");
	System.out.println();
	 k=1;
	while(k<=100){System.out.print('-'); k++;}
	System.out.println();
	for(int i=0;i<multiarray.length;i++){
		for(int j=0;j<multiarray[i].length;j++){
	
			System.out.print("|"+multiarray[i][j]+"|");
	
	
}
		System.out.println("|");
}
	
	while(k<=100){System.out.print('-'); k++;}
	System.out.println();

	for(int row:randomarray){
		System.out.print(row);
	}
	System.out.println();
	for(String[] rows:multiarray){
		for(String Coulmn:rows){
			System.out.print("|"+Coulmn+"");
		}
		System.out.println("|");
	}
	int[] arraycopy=Arrays.copyOf(randomarray, 5);
	for(int row:arraycopy)
	{
		System.out.print(row);
	}
	System.out.println();
	//Arrays.copyOfRange(randomarray, 3, 6);
	System.out.print(Arrays.toString(randomarray));
}

}
