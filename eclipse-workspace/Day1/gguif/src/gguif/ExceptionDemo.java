package gguif;
public  class ExceptionDemo{

	public static void main(String[] args) {
		
		try{

			String s=null;
			System.out.println(s.length());
		}
		catch(Exception e){

			System.out.println("NullPointerException");
		}
            // String s="ajay";
             //int i= Integer.parseInt(s);
			//System.out.println(i);

	}
}