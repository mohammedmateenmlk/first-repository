import java.util.ArrayList;

public class ArrayListExample {
public static void main(String[] args) {
	ArrayList ind=new ArrayList();
	ind.add("Virat");
	ind.add("Rahul");
	ind.add("Rohit");
	ind.add("MSD");
	
	
	ArrayList aus=new ArrayList();
	aus.add("Warner");
	aus.add("simth");
	aus.add("Fintch");
	aus.add("MaxWell");
	
	ArrayList ipl=new ArrayList();
	ipl.addAll(ind);
	ipl.addAll(aus);
	
	System.out.println(ipl);
	
	ipl.remove("simth");
	System.out.println(ipl);
	
	ipl.removeAll(aus);
	System.out.println(ipl);
	
	//OutPut
	
//	[Virat, Rahul, Rohit, MSD, Warner, simth, Fintch, MaxWell]
//			[Virat, Rahul, Rohit, MSD, Warner, Fintch, MaxWell]
//			[Virat, Rahul, Rohit, MSD]
	
	
}
}
