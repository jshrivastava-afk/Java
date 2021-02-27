
public abstract class Match {

	private int currentscore;
	private int curentover;
	private int target;
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public int getCurentover() {
		return curentover;
	}
	public void setCurentover(int curentover) {
		this.curentover = curentover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	
	abstract float calculateRunrate();
	abstract int calculateBalls();
	abstract void display(float reqRunrate, int balls);
	
		
		
	}

