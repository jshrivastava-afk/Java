

import java.util.Date;

public class PlayerClass {
	
	private String name;
	private String dateOfBirth;
	private String skill;
	private int noofmatches;
	private int runs;
	private int wickets;
	private String nationality;
	private double powerRating;
	public PlayerClass(String name, String dateOfBirth, String skill, int noofmatches, int runs, int wickets,
			String nationality, double powerRating) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.skill = skill;
		this.noofmatches = noofmatches;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}
	
	public PlayerClass() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getNoofmatches() {
		return noofmatches;
	}
	public void setNoofmatches(int noofmatches) {
		this.noofmatches = noofmatches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
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
	public double getPowerRating() {
		return powerRating;
	}
	public void setPowerRating(double powerRating) {
		this.powerRating = powerRating;
	}
    
	@Override
	public String toString() {
		return "name=" + name + ", dateOfBirth=" + dateOfBirth + ", skill=" + skill + ", noofmatches="
				+ noofmatches + ", runs=" + runs + ", wickets=" + wickets + ", nationality=" + nationality
				+ ", powerRating=" + powerRating;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) { 
            return true; 
        } 
  
    
        if (!(obj instanceof PlayerClass)) { 
            return false; 
        } 
          
       
        PlayerClass c = (PlayerClass) obj; 
          
       
        return name.equals(c.name) && dateOfBirth.equals(c.dateOfBirth) && Double.compare(noofmatches,c.noofmatches) == 0 && skill.equals(c.skill) && Double.compare(runs,c.runs) == 0&& Double.compare(wickets,c.wickets) == 0&& nationality.equals(c.nationality)&& Double.compare(powerRating,c.powerRating) == 0; 
    } 
		
	}
	

