import java.util.*;

class Factorial{
  
  public static void main(String[] args) {
  	       
  	       int arr[]= new int[5];
           Scanner sc=  new Scanner(System.in);
		   System.out.println("Enter the number:");
	       int num= sc.nextInt();
	       int u= num%10;
	       int t= (num/10)%10;
	       int h= (num/100)%10;
	       int fact=1;
           for(int i=1;i<=h;i++)
           {
           	  
           	 
           	 fact=fact*i;
           	  arr[0]=fact;
}
            System.out.println(arr[0]);

            for(int i=1;i<=t;i++)
           {
           	 fact=fact*i;
           	  arr[1]=fact;
}
            System.out.println(arr[1]);
             for(int i=1;i<=u;i++)
           {
           	
           	 fact=fact*i;
           	  arr[2]=fact;
}
            System.out.println(arr[2]); 
 }
}