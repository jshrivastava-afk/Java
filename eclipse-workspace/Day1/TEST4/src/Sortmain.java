import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Sortmain {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc= new Scanner(System.in);
		
		List<Player> arr=new ArrayList<Player>();
		
		System.out.println("Enter the number of players: ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			String name=sc.nextLine();
			//Date dateOfBirth=new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth);
			String skill=sc.next();
			int numberOfMatches=sc.nextInt();
			String runs=sc.next();
			int wickets=sc.nextInt();
			String nationality=sc.next();
			String powerRating=sc.next();
			
			Player p=new Player();
			
			p.setName(name);
			p.setSkill(skill);
			p.setNumberOfMatches(numberOfMatches);
			p.setRuns(runs);
			p.setWickets(wickets);
			p.setNationality(nationality);
			p.setPowerRating(powerRating);
			
			arr.add(p);
			}
		     System.out.println("Enter a type to sort:\n 1.Sortby of matches played \n 2.Sort by runs played \n 3.Sort by Power Rating");
		     int a=sc.nextInt();
		
		     
		
	}
		}


