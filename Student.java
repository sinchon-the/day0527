package map;

public class Student { 
	private String name; //외부에서 접근하지 못하도록 private 처리
	private int age; //외부에서 접근하지 못하도록 private 처리
	
	public String getName() { //getName : 클래스 내부의 멤버변수(name)를 반환하는 메서드
		return name;
	}
	public int getAge() { //getAge : 클래스 내부의 멤버변수(age)를 반환하는 메서드
		return age;
	}
	
	public void setName(String name) { //setName : 다른 코드에서 name을 쓰기 위해 값을 대입해주는 메서드, 다른곳에서 접근 가능하도록 public
		this.name = name;
	}
	public void setAge(int age) { //setAge : 다른 코드에서 age을 쓰기 위해 값을 대입해주는 메서드, 다른곳에서 접근 가능하도록 public
		this.age = age;
	}
}
