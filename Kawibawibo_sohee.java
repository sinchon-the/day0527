import java.util.Scanner;

public class Kawibawibo_sohee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.가위 2.바위 3.보\n>>");
		int myChoice=sc.nextInt();
		int comChoice=(int)(Math.random()*3)+1;
		
		String choice="";
		switch(myChoice) {
		case 1:
			choice="가위"; break;
		case 2:
			choice="바위"; break;
		case 3:
			choice="보";
		}
		System.out.println("당  신: "+choice);

		switch(comChoice) {
		case 1:
			choice="가위"; break;
		case 2: 
			choice="바위"; break;
		case 3:
			choice="보";
		}
		System.out.println("알파고: "+choice);
		
		//1:가위 2:바위 3:보
		String result="";
		switch(myChoice-comChoice) {
		case -2: case 1:
			result="당신이 이겼습니다."; break;
		case -1: case 2:
			result="당신이 졌습니다."; break;
		case 0: case 3:
			result="비겼습니다.";
		}
		System.out.println(result);
		sc.close();
	}

}
