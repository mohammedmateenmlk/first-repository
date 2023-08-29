import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
public static void main(String[] args) {
	TreeSet<String> treeSet=new TreeSet<String>();
	treeSet.add("cat");
	treeSet.add("Dog");
	treeSet.add("Elephent");
	treeSet.add("Zebra");
	
	//To insert element in treeSet
	
	TreeSet<String> treeSet1=new TreeSet<String>();
	treeSet.add("Red Rose");
	treeSet.add("BMW");
	treeSet.add("Audi");
	
	treeSet.addAll(treeSet1);
	
	//Accessing Data One By One From the TreeMap Using Iterator
	Iterator<String> iterator=treeSet.iterator();
	while(iterator.hasNext()) {
		System.out.print(iterator.next()+" ,");
		
		//OutPut :-  Audi ,BMW ,Dog ,Elephent ,Red Rose ,Zebra ,cat ,
	}
	
	
	System.out.println();
	//We can Remove Usind remove() 
	treeSet.remove("Dog");
	treeSet.remove("Cat");
	treeSet.remove("BMW");
	
	System.out.println(treeSet);
	//OutPut :- Audi ,BMW ,Dog ,Elephent ,Red Rose ,Zebra ,cat ,
	
}
}
