import java.util.Scanner;

public class PlayerClassMain {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter player 1 detail:");
		String Str1=s.next();
		String Str2=s.next();
		String Str3=s.next();
		int a=s.nextInt();
		int a1=s.nextInt();
		int a2=s.nextInt();
		String Str4=s.next();
		double a3=s.nextDouble();
		System.out.println("Enter player 2 detail:");
		String Strr=s.nextLine();
		String Strr1=s.next();
		String Strr2=s.next();
		String Strr3=s.next();
		int ab=s.nextInt();
		int ab1=s.nextInt();
		int ab2=s.nextInt();
		String Strr4=s.next();
		double ab3=s.nextDouble();
		PlayerClass c1 = new PlayerClass(Str1,Str2,Str3,a,a1,a2,Str4,a3); 
		PlayerClass c2 = new PlayerClass(Strr1,Strr2,Strr3,ab,ab1,ab2,Strr4,ab3); 
        if (c1.equals(c2)) { 
            System.out.println("Player1 is same as Player2"); 
        } else { 
            System.out.println("Player1 is not same as Player2 "); 
        } 
    } 
	}
