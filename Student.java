package homework;

public class Student {
	private String name;
	private int age;
	
	Student(){
		name = null;
		age = 0;
	}
	
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	

}
