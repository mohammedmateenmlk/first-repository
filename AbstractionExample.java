package Abstraction;

interface person {
void display();
}

class Student implements person{
	public void display() {
		System.out.println("This is Student class Method");
	}
}

class Lecturer implements person{
	public void display() {
		System.out.println("this is Lecturer class Method");
	}
}

public class AbstractionExample{
	
	public static void main(String[] args) {
		person std= new Student();
		std.display();
		
		person lec= new Lecturer();
		lec.display();
	}
}
//Out Put

//This is Student class Method
//this is Lecturer class Method



