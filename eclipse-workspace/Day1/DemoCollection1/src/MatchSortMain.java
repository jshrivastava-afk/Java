import java.util.*;

public class MatchSortMain {
 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Match> arr= new ArrayList<Match>();
		
		System.out.println("Enter the number of matches:");
		int p=sc.nextInt();
		
		for(int i=0;i<p;i++)
		{
			
			System.out.println("Enter the match date(MM-DD-YYYY): ");
		    String matchDate=sc.next();
		    
		    System.out.println("Enter the name of Team1: ");
			String teamOne=sc.next();
			
			System.out.println("Enter the number of Team2: ");
			String teamTwo=sc.next();
			
			arr.add(new Match(matchDate, teamOne, teamTwo));
		    
		    }
		
		Collections.sort(arr);
		for(Match m:arr)
		{
			System.out.println(m);
		}
		
		
	}
	

	}


