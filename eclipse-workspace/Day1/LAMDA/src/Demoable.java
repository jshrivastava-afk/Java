
public interface Demoable {

	public void display(); 
		
	default void show() {
		
		System.out.println("Lamda1");
	}
}
