
public class Team {

	private String name;
	private int matches;
	
	
	public Team(String name, int matches) {
		super();
		this.name = name;
		this.matches = matches;
		
		
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMatches() {
		return matches;
	}


	public void setMatches(int matches) {
		this.matches = matches;
	}


}