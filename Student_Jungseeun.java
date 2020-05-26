//과제(0526 접근제어자,캡슐화)

class Student {
		
		private String name;
		private int age;
	
		/*private가 없을 시 누구에게나 접근가능하다. 그러니 보안이 취약하다는 점이 있음.
		 * 보안강화하는 방향으로 private 접근 제어자를 사용하여 보안강화를 시킨다.*/
		
		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
		}
		
		public void setName(String name) {
			this.name = name; 
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		/*접근제어자 중 private은 접근이 어려워서
		 *접근제어자 public으로 접근을 용이하게 만듬.
		 *접근을 용이하게 만들기 위해 모두 public으로 바꿔 데이터를 받아들임.
		 */
		
		/*get,set를 생성하여 캡슐화를 함.*/
		
		//0526 jung se eun
		
}