class Innings
{
    private String teamname;
    private String inningsname;
    private int runs;

    public String getTeamName()
    {
    	return teamname;
    }
    public void setTeamName()
    {
        this.teamname=teamname;
    }
     public String getInningsName()
    {
    	return inningsname;
    }
    public void setInningsName()
    {
        this.inningsname=inningsname;
    } 
    public int getRuns()
    {
    	return runs;
    }
    public void setRuns()
    {
        this.runs=runs;
    }

    public void displayInningsDetails()
    {
    	System.out.println("Enter the teamn name:"+getTeamName());
    	if(getInningsName().equalsIgnoreCase("First"))
    	{
    		System.out.println("Enter your runs:"+getRuns());
    		System.out.println("Need"+(getRuns()+1)+"to win the game");
    	}

    	else if(getInningsName().equalsIgnoreCase("Second"))
    	{
    		System.out.println("Enter your runs:"+getRuns());
    		System.out.println("Match  Ended");
    	}
    }

}
