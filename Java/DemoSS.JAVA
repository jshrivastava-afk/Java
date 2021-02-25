import java.util.*;
import java.lang.*;

class DemoSS{

	public static void main(String[] args) {

            Scanner sc= new Scanner(System.in);
 
            System.out.println("Name of 1st Cricketer");
            String s1= sc.nextLine(); 
            System.out.println("Name of 2nd Cricketer");
            String s2= sc.nextLine();
  
               String[] arr1= s1.split(" ");
               String[] arr2= s2.split(" ");
 
               if(arr1[1].equalsIgnoreCase(arr2[1]))
               {
               	System.out.println("Yes");
               }
               else
               {
               	System.out.println("No");
               }
}  

	}
