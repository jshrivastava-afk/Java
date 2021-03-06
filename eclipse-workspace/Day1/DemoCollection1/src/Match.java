

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class Match implements Comparable<Match>
{
	private String matchDate;
	private String teamOne;
	private String teamTwo;
	
	
	
	public Match(String matchDate, String teamOne, String teamTwo) {
		super();
		this.matchDate = matchDate;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
	}
	public String getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}
	public String getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	public String getTeamTwo() {
		return teamTwo;
	}
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	@Override
	public int compareTo(Match o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "matchDate=" + matchDate + " teamOne=" + teamOne + " teamTwo=" + teamTwo ;
	}
	
	

}