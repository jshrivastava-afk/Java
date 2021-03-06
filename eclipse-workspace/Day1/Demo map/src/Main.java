import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList <Player>  arr= new ArrayList<Player>();
	
	System.out.println("PLease provide the number ");
    int p=sc.nextInt();
    
    for(int i=0;i<p;i++)
    {
    	System.out.println("Enter the name of player: ");
    	String name= sc.next();
    	
    	System.out.println("Please select the skill of player \n1.All-Rounder \n2.Batsman \n3.Bowler: ");
    	int a=sc.nextInt();
    	
    	String str="";
    	
    	if(a==1)
    	   str="All rounder";
    	
    	if(a==2)
    		str="Batsman";
    	
    	if(a==3)
    		str="Bowler";
    	
    	arr.add(new Player(name,str));
    	
    }
    
    Collections.sort(arr, new PlayerComaprator());
     for(Player e:arr)
     {
    	 System.out.println(e);
     }
    
	}

}
