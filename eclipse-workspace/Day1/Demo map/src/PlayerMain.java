import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class PlayerMain {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		TreeMap<Integer,Player1> map=new TreeMap<Integer,Player1>();
		
		System.out.println("Enter the number of players:");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of player:");
		    int capn=Integer.parseInt(sc.next());
		    String name=sc.next();
		    String team=sc.next();
		    String skill=sc.next();
		    
		    Player1 p=new Player1();
		    p.setName(name);
		    p.setTeam(team);
		    p.setSkill(skill);
		    map.put(capn, p);
		    
		}
		
            System.out.println("Enter player details:\n");
            Set<Map.Entry<Integer,Player1>>entries=map.entrySet();
            for(Map.Entry<Integer,Player1>entry:entries) {
            	 System.out.println(entry.getKey()+"--"+entry.getValue());
            }
	        }
	}


