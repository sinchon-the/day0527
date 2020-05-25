package day0525;
/*
public class Person {
	String name;
	int age;
}*/
//보안상 문제 있음
//default 존재->패키지 타입 -> 접근 불가능하도록 private

//캡슐화 개념 처리
public class Person {
	private String name;
	private int age;
	
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
		this.age = age;
	}
	
	
}