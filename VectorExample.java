import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
	Vector states=new Vector();
	
	states.add("Tamil Naidu");
	states.add("Bihar");
	states.add("Tilangana");
	states.add("Utter Pardesh");
	
	System.out.println(states.contains("Bihar")); //true
	System.out.println(states.size());             //4 
	System.out.println(states.isEmpty());          //false
	
	//we have four constructor in java 
	
}
}
