
public class Student {
	private String name; // 외부에서의 접근을 막으려고 클래스 내부에서만.
	private int age;// 보안때문에 private 를 쓴다.
	
	
	//get/set을 사용하는 이유 private로 되어있는 변수를 다른 클래스에서 사용하기 위함이다.

	public String getName() {  
		return name;	
	}

	public int getAge() {
		return age;
	}

	public String setName(String name) {
		return name;
	}

	public void setAge() {
		this.age = age;
	}
}
