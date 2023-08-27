package Encapsulation;

public class Test {
public static void main(String[] args) {
	SimpleEncapsulationProgram sep=new SimpleEncapsulationProgram();
	
sep.setId(1);
sep.setName("Rahul");
sep.setPercentage(78.03);

int id=sep.getId();
String name=sep.getName();
double perc=sep.getPercentage();

System.out.println(id);
System.out.println(name);
System.out.println(perc);
}
}
