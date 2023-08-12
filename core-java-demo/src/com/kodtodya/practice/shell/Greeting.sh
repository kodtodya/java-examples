#!/home/kodtodya/_my-space/_setup/_jdk/_jdk-21/bin/java --source 17

public class Greeting {

	public static void main (String[] args) {
	  try{
	   System.out.println("Hello " + args[0] + "..!!!");
	  }catch(Exception exception){
	    System.out.println("Please provide your name as parameter to shell script..");
	    }
	  }
}

//# notes to run this file
//# - Update the first line with your actual java installation path(i.e. JAVA_HOME path)
//# run this file as: `./Greeting.sh <your name>` on your terminal