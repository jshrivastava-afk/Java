import java.util.*;

class EmployeeMain{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name= sc.next();
		System.out.println("Enter Your Address:");
		String address= sc.next();
		System.out.println("Enter Your Mobile:");
		String mobile= sc.next();

		Employee e= new Employee();
		e.setName(name);
		e.setAddress(address);
		e.setMobile(mobile);
		e.display();
	}
}