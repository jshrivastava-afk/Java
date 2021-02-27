
public class MatchT20 extends Match {

	@Override
	float calculateRunrate() {
		
		float reqRunrate= (getTarget()-getCurrentscore())/(20-getCurentover()) ;
		
		return reqRunrate;
	}

	@Override
	int calculateBalls() {
		
		int balls = (120-getCurentover()*6);
	
		return balls;
	}

	@Override
	void display(float reqRunrate, int balls) {
		System.out.println("Need"+(getTarget()-getCurrentscore())+" runs to win in "+(balls));
		System.out.println("Required runrate is"+(reqRunrate));
		
	}
	

	
}
