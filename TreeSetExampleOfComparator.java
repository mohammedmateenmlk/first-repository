import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExampleOfComparator {
public static void main(String[] args) {
	TreeSet<String> treeSet=new TreeSet<String>(new CustomComparator());
	treeSet.add("dog");
	treeSet.add("zebra");
	treeSet.add("cat");
	treeSet.add("horse");
	System.out.println(treeSet);
	}
}


class CustomComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		int value=o1.compareTo(o2);
		
		if(value >0 ) {
			return -1;
		}else if(value < 0) {
			return 1 ;
		}else {
			return 0;
		}

	}
	
}