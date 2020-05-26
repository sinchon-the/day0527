package list;

public class Student {
	private	String name; //default 타입은 보안이 취약해 private 를 써서 다른 외부에서 수정을못하게 막는다
	private	int age;	//default 타입은 보안이 취약해 private 를 써서 다른 외부에서 수정을못하게 막는다
		
public String getName() {   //public이라는 접근자를 써서 어디서든 접근이 가능하게끔하고 getName 을사용하여 멤버의 값을 불러낼수있다  
	return name; //이름을 리턴
}

public int getAge() {  //public이라는 접근자를 써서 어디서든 접근이 가능하게끔하고 getAge 을사용하여 멤버의 값을 불러낼수있다  
	return age;	 //나이를 리턴
}

public void setName(String name) { //public 접근자 사용해서 접근이 가능하게끔하고 setName 을 사용하여 값을 셋팅할수있다.
	this.name=name; //this를 사용함으로 private에있는 멤버필드 값을 얻어온다  
}
public void setAge(int age) { //public 접근자 사용해서 접근이 가능하게끔하고 setage 을 사용하여 값을 셋팅할수있다.
	this.age=age; //this를 사용함으로 private에있는 멤버필드 값을 얻어온다
}
		
}
