package ex;

public class Student {
	//default접근제한자로 하면 외부에서 접근이 가능하기 때문에 private로 접근을 제한해준다.
	private String name;
	private int age;
	
	//멤버필드를 private로 제한을 해놨기 때문에 public 메서드로 외부에서 접근가능하게 한다.
	//public 메서드 파라미터를 통해 멤버필드 수정을 가능하게한다.
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getInt() {
		return age;
	}

}
