package Encapsulation2;

public class Test {
public static void main(String[] args) {
	Bank bank=new Bank();
	bank.setId(1);
	bank.setName("Rama");
	bank.setAccountno(132645);
	
	int id=bank.getId();
	String name=bank.getName();
	long ano=bank.getAccountno();
	
	System.out.println(name);
	System.out.println(id);
	System.out.println(ano);
	
	
}
}
