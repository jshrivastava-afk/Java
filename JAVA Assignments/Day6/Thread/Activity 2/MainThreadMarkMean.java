package democollection1;

import java.util.Scanner;

public class MainThreadMarkMean {

	public static void main(String[] args) throws InterruptedException {

		Scanner s= new Scanner(System.in);
	       
		System.out.println("Enter the Match ");
        String str=s.next();
        System.out.println("Enter the Scores");
        String str1=s.next();
        Thread t3=new CalculateScores(str,str1);
        System.out.println("Enter the Match ");
        String strr=s.next();
        System.out.println("Enter the Scores");
        String strrr=s.next();
        Thread t4=new CalculateScores(strr,strrr);
        System.out.println("Enter the Match ");
        String strrrr=s.next();
        System.out.println("Enter the Scores");
        String str1rr=s.next();
        Thread t5=new CalculateScores(strrrr,str1rr);
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        t5.start();
        t5.join();

	}

}
