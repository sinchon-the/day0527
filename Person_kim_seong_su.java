package test;

import java.time.LocalDate;
import java.util.Scanner;

public class Person_kim_seong_su{
	
		private String name;//외부에서 사용 할 수 있기 때문에 접근제한자 private를 써줍니다.
		private int age;//외부에서 사용 할 수 있기 때문에 접근제한자 private를 써줍니다.
		public String getName() {
			return name;
		}
		//public는 어디서든 접근이 가능합니다.
		//getName() 멤버필드 name의 값을 얻어오는 메서드
		public int getAge() { 
			return age;
		}//setName() 메서드를 사용해 셋팅
		public void setName(String name) {
			this.name = name;
		}//setName() 메서드를 사용해 셋팅
		public void setAge(int age) {
			this.age = age;
		}
		
}