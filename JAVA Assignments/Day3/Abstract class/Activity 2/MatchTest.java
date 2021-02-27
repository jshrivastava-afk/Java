

public class MatchTest extends Match {

	@Override
	float calculateRunrate() {
		
		float reqRunrate= (getTarget()-getCurrentscore())/(90-getCurentover()) ;
		
		return reqRunrate;
	}

	@Override
	int calculateBalls() {
		
		int balls = (540-getCurentover()*6);
	
		return balls;
	}

	@Override
	void display(float reqRunrate, int balls) {
		System.out.println("Need"+(getTarget()-getCurrentscore())+" runs to win in "+(balls));
		System.out.println("Required runrate is"+(reqRunrate));
		
	}
	

	
}
