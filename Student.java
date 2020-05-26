package map;

public class Student {
//	String name;//접근제한자를 default타입으로 설정해서 외부에서 다이렉트로 접근이 가능하다.
//	int age;//접근제한자를 private로 설정하여 클래스 내에서만 접근을 할 수 있도록 해준다.
	//private의 경우 외부에서 접근할 수 없으므로 캡슐화하기위해서  get,set메서드를 public modifier로 생해준다.
	//
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}//getName 은 위에 잇는 name 멤버 필드 값을 얻어오는 메서드이다.
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}//getAge 는 위에 있는 class 필드의 age값을 얻어오는 메서드이다.
	public void setAge(int age) {
		this.age = age;
	}


}
