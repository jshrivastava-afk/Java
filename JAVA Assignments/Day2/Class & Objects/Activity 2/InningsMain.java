import java.util.*;

class InningsMain{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Team Name:");
		String teamname= sc.next();
		System.out.println("Enter Your Innings Name:");
		String inningsname= sc.next();
		System.out.println("Enter Your Runs:");
		int runs= sc.nextInt();

		Innings ob= new Innings();

		ob.setTeamName(teamname);
		ob.setInningsName(inningsname);
		ob.setRuns(runs);
        ob.displayInningsDetails();
}
}