
public class Vechile {

	 private String make;
	 private String vechileNumber;
	 private String fueltype;
	 private int fuelcapacaity;
	 private int cc;
	 
	 
	 
	public Vechile() {
		super();
	}
	public Vechile(String make, String vechileNumber, String fueltype, int fuelcapacaity, int cc) {
		super();
		this.make = make;
		this.vechileNumber = vechileNumber;
		this.fueltype = fueltype;
		this.fuelcapacaity = fuelcapacaity;
		this.cc = cc;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVechileNumber() {
		return vechileNumber;
	}
	public void setVechileNumber(String vechileNumber) {
		this.vechileNumber = vechileNumber;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public int getFuelcapacaity() {
		return fuelcapacaity;
	}
	public void setFuelcapacaity(int fuelcapacaity) {
		this.fuelcapacaity = fuelcapacaity;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	 
	 public void displayMake() {
		 
		 System.out.println("Enter The make of Vechile:"+getMake());
	 }
	 
	 public void displayBasicInfo() {
		 
		 System.out.println("Enter the vechile number:"+getVechileNumber());
		 System.out.println("Enter the fuel type of vechile:"+getFueltype());
		 System.out.println("Enter the fuel capacity of vechile:"+getFuelcapacaity());
		 System.out.println("Enter the cc of engine:"+getCc());
	 }
	 
	 public void Detailinfo() {
		 
		 
	 }
	
	}

