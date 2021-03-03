import java.util.Comparator;

public class RunComparator implements Comparator <Player> {

	@Override
	public int compare(Player o1, Player o2) {
		
		if(o1.getRuns().compareTo(o2.getRuns())==0)
		{
			return 0;
		}
		else if(o1.getRuns().compareTo(o2.getRuns())<0)
		{
			return 1;
		}
		
		else {
		
		return -1;
		
		}
	}

}
