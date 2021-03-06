import java.util.Comparator;

public class PowerRatingComparator implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		
		if(o1.getPowerRating().compareTo(o2.getPowerRating())==0)
		{
			return 0;
		}
		else if(o1.getPowerRating().compareTo(o2.getPowerRating())<0)
		{
			return 1;
		}
		else {
	
			return -1;
		}
	
	}
		

}
