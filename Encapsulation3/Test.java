package Encapsulation3;

 class StudentValidation {
	 private int id;
	 private String name;
	 private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id>=0) {
		this.id = id;
		}else {
			System.out.println("Invalid id");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0) {
		this.age = age;
		}else {
			System.out.println("invalid Age");
		}
	}
	 
}

 public class Test{
	 public static void main(String[] args) {
		StudentValidation sv=new StudentValidation();
		sv.setAge(21);
		sv.setName("rahul");
		sv.setId(1);
		
		//if we give the age less then "0" then we get A message
		
		int id=sv.getId();
		String name=sv.getName();
		int age=sv.getAge();
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
 }
 
 
 
 