import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {
public static void main(String[] args) {
	SortedMap<Integer, String> tm=new TreeMap<Integer, String>();
	
	tm.put(1,"kiran");
	tm.put(2, "Rahul");
	tm.put(3, "Vishal");
	tm.put(4, "salman");
	
    //Returns key-value pairs whose keys are less than the specified key.
	System.out.println("Head Mp :"+ tm.headMap(2));
	
    //Returns key-value pairs whose keys are greater than the specified key.
	System.out.println("tail Mp :"+ tm.tailMap(2));
	
	   //Returns key-value pairs whose keys are in between  the specified keys.\
	System.out.println("subMap :"+ tm.subMap(1, 4));
	
}
}
