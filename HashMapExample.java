import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
public static void main(String[] args) {
	HashMap<Integer, String> hm=new HashMap<Integer, String>();
	hm.put(1000, "a");
	hm.put(2000, "b");
	hm.put(3000, "c");
	hm.put(4000, "d");
	
	//Traversing  through map Using for-Each method
	
	for(Map.Entry<Integer, String> me : hm.entrySet()) {
		System.out.print("this is key :"+me.getKey());
		System.out.println("  this is Value :"+me.getValue());
	}
}
} 
