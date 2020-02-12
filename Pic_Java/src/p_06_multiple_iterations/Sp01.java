package p_06_multiple_iterations;

public class Sp01 {
//for 문 사용하기
	public static void main(String[] args) {
		//for(초기화 식1; 다시 반복할지 확인하는 식2; 변화를 주기 위한 식3)
		for(int i = 1; i <= 5; i++) {                           //for(식1; 식2; 식3)
			System.out.println("반복하고 있습니다.");        //문장;
			//변수i의 값을 1씩 증가시키면 i<=5가 거짓이 될때까지 문장을 반복함
		}
		System.out.println("반복이 끝났습니다.");
	}

}
