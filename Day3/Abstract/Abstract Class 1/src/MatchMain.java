import java.util.*;


public class MatchMain {

	public static void main(String[] args)
	{
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Format:\n");
	System.out.println("1.ODI\n 2.T20\n 3.Test");
	int x= sc.nextInt();
	
	if(x==1)
	{
	  MatchODI O = new MatchODI();
	  
	  System.out.println("Enter the Current score: ");
	  int currentscore= sc.nextInt();
	  System.out.println("Enter the Current over: ");
	  int curentover= sc.nextInt();
	  System.out.println("Enter the Target ");
	  int target= sc.nextInt();
	  
	  float reqRunrate= O.calculateRunrate();
	  int balls= O.calculateBalls();
	  
	  O.setCurrentscore(currentscore);
	  O.setCurentover(curentover);
	  O.setTarget(target);
	  O.calculateRunrate();
	  O.calculateBalls();
	  O.display(reqRunrate, balls);
	}
	
	if(x==2)
	{
	  
		MatchT20 T = new MatchT20();
		  
		  System.out.println("Enter the Current score: ");
		  int currentscore= sc.nextInt();
		  System.out.println("Enter the Current over: ");
		  int curentover= sc.nextInt();
		  System.out.println("Enter the Target ");
		  int target= sc.nextInt();
		  
		  float reqRunrate= T.calculateRunrate();
		  int balls= T.calculateBalls();
		  
		  T.setCurrentscore(currentscore);
		  T.setCurentover(curentover);
		  T.setTarget(target);
		  T.calculateRunrate();
		  T.calculateBalls();
		  T.display(reqRunrate, balls);
		  
		
	}
	
	
}
