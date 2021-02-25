import java.util.*;
class DemoA{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of values you need:");
		int n=sc.nextInt();
		int []b= new int[n];
		for (int i=0;i<n;i++ ) {
			System.out.println("Enter the value of "+i+" : ");
		 b[i]=sc.nextInt();
		}
        System.out.println("mY values are:");
        for (int j:b) {
        	System.out.println(j);
        }
	}
}