package controller;

public class Person_전봉걸 {//public은 어디서든 접근이 가능하다...
	
	private String name;//보안상 외부에서 접근 불가능하게 private를 쓴다...
	private int age;//보안상 외부에서 접근 불가능하게 private를 쓴다...
	
	public String getName() {
		//get()은 값을 얻어오는 메소드
		return name;
		//return으로 name값 변환
	}
	
	public int getAge() {
		//return으로 age값 변환
		return age;
	}
	
	public void setName(String name) {
		//set()은 값을 설정하는 메소드
		this.name = name;
		//this.name은 클래스 멤버변수 네임
		//name(오른쪽)은 파라미터 변수(매개변수) 네임
	}
	
	public void setAge(int age) {
		this.age = age;
		//this.age는 클래스 멤버변수 네임
		//age(오른쪽)는 파라미터 변수(매개변수) 네임
	}
		//get, set을 생성하여 캡슐화한다...
}