
public class MatchODI extends Match {

	@Override
	float calculateRunrate() {
		
		int a= (getTarget()-getCurrentscore())/(50-getCurentover()) ;
		 System.out.println("Runrate Required:"+a);
		
		return a;
	}

	@Override
	int calculateBalls() {
		
		int b = (300-getCurentover()*6);
		System.out.println("Need"+(getTarget()-getCurrentscore())+"in"+b);
		return b;
	}

	@Override
	void display(double reqRunrate, int balls) {
		
		
	}
	

	
}
