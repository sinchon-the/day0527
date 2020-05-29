
public class Person {

	private String name;
	private int age;
	
	//필드를 private로 만들어 외부의 접근을 제한한 후, Setter를 사용해 전달받은 값을 내부에서 가공해 필드에 넣어주는 방식을 사용하고 마찬가지로 필드 값을 가져올 때도
	//Getter를 사용해 본 필드의 값을 숨긴 채 내부에서 가공된 값을 꺼낼 수 있습니다.
	
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
