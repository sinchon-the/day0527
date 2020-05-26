
/*class Student {
	String name;
	int age;
}*/

/*
 *
 * 외부에서 직접적으로 접근이 가능하므로 멤버필드에 접근제한자 private를 붙여준다.
 * private의 경우 외부에서 접근할 수 없으므로 캡슐화하기위해서  get,set메서드를 public modifier로 생해준다.
 * class에서는 public class가 하나만 존재한다.->public은 어디서든 접근이 가능하다
 * get()메소드는 값을 얻어오는 메소드, set()메소드는 값을 설정하는 메소드
 *
 */

public class Student{
	private String name;//외부 클래스 접근 x
	private int age;
	
	public String getName() { //return형 타입 주의!
		//private 멤버필드에 접근하여 값을 얻어오는 메소드
		return name;//return 으로 name 값 반환
	}
	public void setName(String name) {//return형 타입 주의!
		//private 멤버필드에 접근하여 값을 설정하는 메소드
		this.name = name; //this키워드로 바깥에 있는 name에 접근
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
