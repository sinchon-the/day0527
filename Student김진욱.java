package day0526;
// private의 경우 외부에서 접근할 수 없으므로 캡슐화하기위해서  get,set메서드를 public modifier로 생해준다.

public class Student { //  
	
	private String name;  //외부에서의 접근을 막을려고 private를 사용했다. 
	private int age;  // 
		
	public String getName() { //getName 클래스 내부의 멤버변수를 변환하는 메서드
		return name; // 지역변수를 return으로 반환시키기 위해 사용한다.
	}
	public int getAge() { //getAge 클래스 내부의 멤버변수를 변화하는 메서드
		return age; // 지역변수를 return으로 반환시키기 위해 사용한다.
	}
	
	public void setName(String name) { //다른 코드에서 name를 사용하기위해 대입해주는 메서드
		this.name=name; //this키워드로 바깥에 잇는 name에 접근
		
	}
	public void setAge(int age) { //다른 코드에서 name를 사용하기위해 대입해주는 메서드
		this.age= age;
	}

}
	
	


