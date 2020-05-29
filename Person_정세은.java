package Test0529;

public class Person_정세은 {
	
	private String name; 
	private int age;
	//보안강화를 위해 외부에서 접근불가인 접근제어자 private를 사용함.
	
	public String getName() { //get메서드
		return name;
	}
	public void setName(String name) { //set메서드
		this.name = name; //this사용이유 : class멤버변수와 파라미터변수의 구분을 위해 사용
	}
	public int getAge() { //get메서드
		return age;
	}
	public void setAge(int age) { //set메서드
		this.age = age;
	}
	
	//private를 외부접근불가이기떄문에, public 과 get-set 캡슐화를 통해 우회해서 접근한다. 
	//get-set 캡슐화
	

}
