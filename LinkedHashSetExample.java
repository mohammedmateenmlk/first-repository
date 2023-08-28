import java.util.LinkedHashSet;

public class LinkedHashSetExample {
public static void main(String[] args) {
	LinkedHashSet<String> lhs=new LinkedHashSet<String>();
	lhs.add("Rahul");
	lhs.add("Virat");
	lhs.add("MSD");
	
	
	
	System.out.println(lhs.hashCode());
	
	System.out.println(lhs);
	
}
}

//OutPut
//161462304
//[Rahul, Virat, MSD]