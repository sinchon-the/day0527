package exam0529;

/*
 class Person { 
	String name;
	int age;
}

1. public 제한자는 객체 외부에 노출되어 데이터를 수정할 수 있어 오염된 데이터가 입력될 수 있고, 권한 없는 사람이 읽는 등의 
     보안상 문제가 있으므로 private 접근제한자 사용하여 변수 선언
2. private 접근제한자를 사용하면 정보가 은닉된다. 해당 데이터에 접근하기 위해 get/set 메소드를 사용한다.
3. get()메소드를 통해 데이터 값을 받아온다.
4. set()메소드를 통해 데이터 값을 설정한다. 이 때, parameter(매개변수)를 설정해주고, this키워드로 private설정한 멤버변수에 접근한다.

*/

public class Person_한소희 {
	private String name; //private접근제한자 사용하여 데이터 보안 유지
	private int age;
	
	//get/set 메소드는 public 제한자로 설정하여 외부 클래스에서도 접근이 가능하도록 한다. 
	public String getName() {//get()메소드로 name 멤버변수에 접근
		return name; //return형 타입 주의 ->String
	}
	public void setName(String name) {//set()메소드로 name의 값 설정
		this.name = name;
	}
	public int getAge() {//get()메소드로 age 멤버변수에 접근
		return age;//return형 타입 주의 ->int
	}
	public void setAge(int age) {//set()메소드로 age의 값 설정
		this.age = age;
	}
	
}
