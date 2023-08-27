
public class Polymorphism3 {
void Display() {
	System.out.println("this Method is from parent class");
}
}

class PolymorphismChild extends Polymorphism3{
@Override
void Display() {
	System.out.println("This Method is from child class");
}
}

class Tetspolymorphism {
	public static void main(String[] args) {
		PolymorphismChild plc=new PolymorphismChild();
		plc.Display();
	}
}

