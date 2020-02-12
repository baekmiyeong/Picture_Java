package p_06_multiple_iterations;

public class Sp06 {
//do~while 문 사용하기		//무조건 문장 1번 수행 후 조건 확인
	public static void main(String[] args) {
		int i = 1;
		
		do {                                            //do {
			System.out.println(i + "번째 반복입니다.");     //문장;
			i++;                                        // :
		} while(i <= 5);                                //} while(조건);
		//거짓이 되면 반복 작업 종료
		System.out.println("반복이 끝났습니다.");
	}

}
