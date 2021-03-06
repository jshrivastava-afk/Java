import java.util.Date;

public class Player implements Comparable<Player> {

	private String name;
	//private String dateOfBirth;
	private String skill;
	private int numberOfMatches;
	private String runs;
	private int wickets;
	private String nationality;
	private String powerRating;
	
	public Player() {
		super();
	}

	public Player(String name, String skill, int numberOfMatches, String runs, int wickets,
			String nationality, String powerRating) {
		super();
		this.name = name;
		//this.dateOfBirth = dateOfBirth;
		this.skill = skill;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}

	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//public String getDateOfBirth() {
		//return dateOfBirth;
	//}

	//public void setDateOfBirth(String dateOfBirth) {
		//this.dateOfBirth = dateOfBirth;
	//}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getNumberOfMatches() {
		return numberOfMatches;
	}

	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

	public String getRuns() {
		return runs;
	}

	public void setRuns(String runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPowerRating() {
		return powerRating;
	}

	public void setPowerRating(String powerRating) {
		this.powerRating = powerRating;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", skill=" + skill + ", numberOfMatches="
				+ numberOfMatches + ", runs=" + runs + ", wickets=" + wickets + ", nationality=" + nationality
				+ ", powerRating=" + powerRating + "]";
	}

	@Override
	public int compareTo(Player o) {
		
		if(numberOfMatches==o.getNumberOfMatches()) {
			
			return 0;
		}
		else if(numberOfMatches<o.getNumberOfMatches())
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}
	
	
	
}


