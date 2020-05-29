package 문제13;

public class Person {

	private String name; //보안을 위해 외부 클래스에서 직접적인 접근 제한
	private int age; //보안을 위해 외부 클래스에서 직접적인 접근 제한
	//단, 외부 클래스에서 쓸 수 있도록 getter setter 사용
	
	public String getName() { //name값을 가져와 초기화하기 위해
		return name; 
	}
	public void setName(String name) { //name 변수에 문자열 값을 넣기 위해
		this.name = name; //멤버필드에 있는 name값
	}
	public int getAge() { //age 값을 가져와 초기화 하기 위해
		return age;
	}
	public void setAge(int age) { //age 변수에 값을 넣기 위해
		this.age = age; //멤버필드에 있는 age값 
	}

}
 