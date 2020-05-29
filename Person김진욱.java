
public class Person {
	
	// private 와 set메서드를 사용하게 되면

	// set메서드 안에서 조건을 걸어 입력받는게 가능해지므로

	// 누군가가 데이터를 아무렇게나 변경하거나 하는 것을 제한할 수 있게 된다.

	// 즉 이유는 보안이라고 할수 있다. 
	
	//권한이  없는 사람이 읽는 수 없다.

	
private String name;

private int age;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}


	
}
		 

