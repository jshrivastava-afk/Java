import java.util.*;
import java.lang.*;

class DemoS{

	public static void main(String[] args) {

            Scanner sc= new Scanner(System.in);
 
            System.out.println("First Name");
            String s1= sc.next(); 
            System.out.println("Last Name");
            String s2= sc.next();

            System.out.println(s1.substring(0,1).toUpperCase()+s1.substring(1).toLowerCase() +" "+s2.toUpperCase()); 
	}
} 