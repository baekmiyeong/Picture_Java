package p_07_Array;

public class Sp04 {
//배열 초기화하기(배열의 선언, 생성, 값대입 동시진행)
	public static void main(String[] args) {
		//배열 [] 배열 변수명 = {값1, 값2, 값3, ...}
		
		int [] test = {80, 60, 22, 50, 75}; //배열 초기화
		
		for(int i=0; i<5; i++) {
			System.out.println((i + 1) + "번째 사람의 점수는 " + test[i] + "입니다.");
		}
	}

}
