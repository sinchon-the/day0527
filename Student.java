package Student;

public class Student {
		private String name;//private로 외부에서 접근 못하게 하고 클래스 내부에서만 사용할 수 있습니다.
		private int age;//private로 외부에서 접근 못하게 하고 클래스 내부에서만 사용할 수 있습니다.
		
		//public은 어디서든 접근이 가능합니다
		//getName() 멤버필드 name의 값을 얻어오는 메서드
		public String getName() {
			return name;
		}
		//setName() 셋팅 해주는 
		public void setName(String name) {
			this.name = name;
		}
		//getAge() class 멤버인 age의 값을 얻어오는 메서드
		public int getAge() {
			return age;
		}
		//setName() 셋팅 해주는 
		public void setAge(int age) {
			this.age = age;
		}
		
		


}
