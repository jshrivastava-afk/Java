import java.util.Scanner;

public class VechileMain {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Vechile v= new Vechile();
		
	
		
		System.out.println("Enter the make of vechile:");
		String make= sc.next();
		System.out.println("Enter the vehicle number:");
		String vechileNumber= sc.next();
		System.out.println("Enter the fuel type:");
		String fueltype= sc.next();
		System.out.println("Enter the fuelcapacity:");
		int fuelcapacaity= sc.nextInt();	 
		System.out.println("Enter the cc of engine:");
        int cc= sc.nextInt();
        
       System.out.println("Kickstart Available(Yes/No):");
       String s = sc.next();
       boolean b =false;
    
       if(s.equalsIgnoreCase("yes")){
    	   
    	   b=true;
    	   
       
       }
       else if(s.equalsIgnoreCase("no")) {
    	   b=false;
    	   
    	   
       }

   
        boolean kickStartAvailable= sc.nextBoolean();
        System.out.println("Enter Audio system Installed:");
        String audioSystem= sc.next();
        System.out.println("Enter number of doors:");
        int numberofdoors= sc.nextInt();
      
        TwoWheeler t1= new TwoWheeler(make,vechileNumber,fueltype,fuelcapacaity,cc,kickStartAvailable);
        FourWheeler f = new FourWheeler(make,vechileNumber,fueltype, fuelcapacaity, cc,
        	audioSystem,  numberofdoors);
        
        t1.displayMake();
        t1.displayBasicInfo();
        t1.displayDetailInfo();
        
        f.displayMake();
       f.displayBasicInfo(); 
       f.displayDetailInfo();
        
        
	}
	

}
