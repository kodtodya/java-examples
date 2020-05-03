#!/home/kodtodya/my-space/_setup/_jvm/jdk-11/bin/java --source 11

public class Greeting {

	public static void main (String[] args) {
	  try{
	   System.out.println("Hello " + args[0] + "..!!!");
	  }catch(Exception exception){
	    System.out.println("Please provide your name as parameter to shell script..");
	    }
	  }
}
