package p_07_Array;

public class Sp06 {
//배열요소의 값 바꾸기
	public static void main(String[] args) {
		int [] test1;
		test1 = new int[3];
		System.out.println("test1을 선언했습니다.");
		System.out.println("배열 요소를 생성했습니다.");
		
		test1[0] = 80;
		test1[1] = 60;
		test1[2] = 22;
		
		int [] test2;		//배열 변수만 선언
		System.out.println("test2를 선언했습니다.");
		
		test2 = test1;		//배열 변수에 배열을 대입
		System.out.println("test2에 test1을 대입했습니다.");
		
		for(int i=0; i<3; i++) {
			System.out.println("test1(이)가 가르키는 " + (i+1) + 
					"번째 사람의 점수는 " + test1[i] + "입니다.");
		}
		
		for(int i=0; i<3; i++) {
			System.out.println("test2(이)가 가르키는 " + (i+1) + 
					"번째 사람의 점수는 " + test2[i] + "입니다.");
		}
		
		System.out.println();
		
		test1[2] = 100;
		System.out.println("test1이 가리키는 세 번째 사람의 점수를 변경합니다.");
		
		for(int i=0; i<3; i++) {
			System.out.println("test1(이)가 가르키는 " + (i+1) + 
					"번째 사람의 점수는 " + test1[i] + "입니다.");
		}
		
		for(int i=0; i<3; i++) {
			System.out.println("test2(이)가 가르키는 " + (i+1) + 
					"번째 사람의 점수는 " + test2[i] + "입니다.");
		}
		//test1의 값을 바꾸면 test2도 바뀜. 즉 동일한 하나의 배열을 가리킨다
		//대입되는 좌변의 배열 변수가 우변의 배열 변수를 가리키게 된다!!
	}

}
