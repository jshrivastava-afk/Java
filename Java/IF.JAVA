import java.util.*;
class DemoJ{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value:");
		int a=sc.nextInt();
		if (a>18) {
			System.out.println("Eligible");
		}
		else{
			System.out.println("Not Eligible");
		}
	}
}