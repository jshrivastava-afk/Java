
public class MatchODI extends Match
  {

	@Override
	float calculateRunrate() {
		
		float reqRunrate= (getTarget()-getCurrentscore())/(50-getCurentover()) ;
		 System.out.println("Runrate Required:"+reqRunrate);
		
		return reqRunrate;
		
	}

	@Override
	int calculateBalls() {
		
		int balls = (300-(getCurentover()*6));
		System.out.println("Need"+(getTarget()-getCurrentscore())+"in"+balls);
		return balls;
		
	}

	@Override
	void display(float reqRunrate, int balls) {
		
		System.out.println("Need"+(getTarget()-getCurrentscore())+"to win in"+balls);
		System.out.println("Requirend runrate is"+reqRunrate);
		
	}

  }
