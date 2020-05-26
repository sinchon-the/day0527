package students;

public class Student_봉걸 {//public은 어디서든 접근이 가능하다...
	
	private String name;//보안상 외부에서 접근 불가능하게 private를 쓴다...
	private int age;//보안상 외부에서 접근 불가능하게 private를 쓴다...
	
	public String getName() {
		//get()은 값을 얻어오는 메소드 
		return name;
		//return으로 name값 변환
	}
	public int getAge() {
		//set()은 값을 설정하는 메소드
		return age;
		//return으로 age값 변환
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
