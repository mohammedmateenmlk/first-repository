
public class Polymorphism {
void sum(int a) {
	System.out.println(a+1);
}
void sum(int a ,int b) {
	System.out.println(a+b+1);
}
void sum(int a,int b,int c) {
	System.out.println(a+b+c+1);
}

}

class Test{
	public static void main(String[] args) {
		Polymorphism plm=new Polymorphism();
		plm.sum(1);
		plm.sum(1, 2);
		
	}
	
	//if we pass sum() with one arguments it will call one parametaries method
	
	//if we pass sum() with two arguments it will call two parametaries method
	
	//if we pass sum() with Three arguments it will call Three parametaries method
}
