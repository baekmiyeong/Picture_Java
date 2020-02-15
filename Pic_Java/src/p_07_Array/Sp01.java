package p_07_Array;

public class Sp01 {
//배열 사용하기
	public static void main(String[] args) {
		//배열 [] 배열 변수명;		//배열 변수 => 참조 변수
		//배열 변수명 = new형명[인덱스];
		//배열 변수명[인덱스] = 식;
		
		int [] test;		//배열변수 선언
		test = new int[5];	//배열요소 생성
			
		test[0] = 80;
		test[1] = 60;
		test[2] = 22;
		test[3] = 50;
		test[4] = 75;		//배열 요소에 값을 대입
		
		for(int i=0; i<5; i++) {
			System.out.println((i + 1) + "번째 사람의 점수는 " + test[i] + "입니다.");
			//배열의 인덱스는 0부터니까 1을 더함                               //배열의 요소 출력
		}
	}

}
