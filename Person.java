package pack1;

public class Person {
	int age;
	String name;
	 
	public void  age (int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	public void getName(String name) {
		this.name=name;
	}

Person(String name , int age){
	this.age=age;
	this.name=name;
	
}
}
