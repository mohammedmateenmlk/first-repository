import java.util.LinkedList;

public class LinkedListExample {
public static void main(String[] args) {
	LinkedList<String> li=new LinkedList<String>();
	li.add("Virat");
	li.add("Rahul");
	li.add("MSD");
	li.add("Rohit");
	
//	  li.add(15);   Error in this line because of Generics
	System.out.println(li);
	
}
}

//OutPut
//[Virat, Rahul, MSD, Rohit]