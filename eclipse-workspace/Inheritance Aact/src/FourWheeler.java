
public class FourWheeler extends Vechile {
	
	private String audioSystem;
	private int numberofdoors;
	
	
	
	public FourWheeler(String make, String vechileNumber, String fueltype, int fuelcapacaity, int cc,
			String audioSystem, int numberofdoors) {
		super(make, vechileNumber, fueltype, fuelcapacaity, cc);
		this.audioSystem = audioSystem;
		this.numberofdoors = numberofdoors;
	}
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberofdoors() {
		return numberofdoors;
	}
	public void setNumberofdoors(int numberofdoors) {
		this.numberofdoors = numberofdoors;
	}
	
	public void displayDetailInfo() {
		
		System.out.println("Name of the audio system insattled:"+getAudioSystem());
		System.out.println("Number of DOORS:"+getNumberofdoors());
		
	}

}
