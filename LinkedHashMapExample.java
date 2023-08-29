import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
public static void main(String[] args) {
	Map<Integer, String> lhm=new LinkedHashMap<Integer, String>();
	
	
	lhm.put(1, "Virat");
	lhm.put(2,"rahul");
	lhm.put(3, "MSD");
	lhm.put(4,"suchhin");
	
	
	for(Map.Entry<Integer, String> e :  lhm.entrySet()) {
		System.out.println(e.getKey()+ " :"  
				+ e.getValue());
	}
	System.out.println(lhm);
	
	//Removing Objects
	lhm.remove(2);
	System.out.println(lhm);
}

}
