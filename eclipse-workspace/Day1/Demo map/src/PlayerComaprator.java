import java.util.Comparator;

public class PlayerComaprator implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		
	if((o1.getSkill().compareTo(o2.getSkill())==0 && (o1.getName().compareTo(o2.getName())==0)))
		
		{
			return 0;
	}
		
	else if((o1.getSkill().compareTo(o2.getSkill())<0 && (o1.getName().compareTo(o2.getName())<0)))
			
		{
			return 1;		}
		
	else
	{	return -1;	}
//		return o1.getSkill().compareTo(o2.getSkill());
	}

	
}
