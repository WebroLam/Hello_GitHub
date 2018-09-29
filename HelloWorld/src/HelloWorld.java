import java.util.*;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int []x = new int [n];
		for(int i=0; i<n; i++)
			x[i]=reader.nextInt();
		for(int i=0; i<n; i++)
		{
			if(x[i]-x[i-1]<0)
			{
				System.out.println(i);
				break;
			}
		}
	}
}
