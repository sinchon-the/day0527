package collections;

public class Student {
	//이 클래스의 문제점을 찾고, 올바르게 고쳐보기
	/*
	String name;
	int age;
	*/
	
	//현재 default로 선언되어 있는 변수는 보안상의 문제로 private로 선언해야한다.
	//->외부에서의 접근허용,자유롭게 읽고 쓸수 있다,오염된 데이터가 객체에 들어올 수 있다.
	private String name;
	private int age;
	//따라서 메서드를 통해 우회해서 데이터를 얻어야한다!
	//메서드는 외부에서 허용가능이므로 public 선언
	//get으로 값을 받고, set으로 변수를 초기화해준다
	
	//이름을 초기화
	public void setName(String name) {
		this.name=name;
	}
	//나이를 초기화
	public void setAge(int age) {
		this.age=age;
	}
	//이름을 리턴
	public String getName() {
		return name;
	}
	//나이를 리턴
	public int getAge() {
		return age;
	}

}
