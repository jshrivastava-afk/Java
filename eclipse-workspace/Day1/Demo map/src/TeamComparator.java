import java.util.Comparator;

public class TeamComparator implements Comparator<Team> {

	@Override
	public int compare(Team o1, Team o2) {
		
		if(o1.getMatches().compareTo(o2.getMatches())==0) {
			
			return 0;
		}
		
		else if(o1.getMatches().compareTo(o2.getMatches())<0)
		{
			return 1;
		}
		
		
		return -1;
	}

}
