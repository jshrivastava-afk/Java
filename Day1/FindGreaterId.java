import java.util.*;

public class FindGreaterId {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many scores you want to enter");
		int size = sc.nextInt();
		
		int arr []= new int [size];
		
		System.out.println("Enter the id and Scores into the array of size"+size);
	
		for(int i =0 ; i<size; i++) {
			
			if(i<size){
				
			System.out.println("Enter the Player Id followed by runs scored ");
			
			arr[i]=sc.nextInt();
			}
			
		}
		
		
		System.out.println("Entered elements are");
		for(int i =0;i<size;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Enter the score you wish t check how many player have crossed");
		int ser = sc.nextInt();
		
		findCricketerId(arr,size,ser);
		}

	public static void findCricketerId(int[] arr, int size, int ser) {
		
		for (int i=1;i<size;i++) {
			
			if(arr[i]>ser) { 
				System.out.println(arr[i-1]  );
				i=i+2;
				
				
			}
		
		}
		
	}
		
}