package p_06_multiple_iterations;

public class Sp05 {
//while 문 사용하기
	public static void main(String[] args) {
		int i = 1;
		
		while(i <= 5) {                                 	//while(조건)		//조건 참일때
			System.out.println(i + "번째 반복입니다.");      //문장;			//문장 반복 실행
			i++;                                            //조건이 거짓에 가까워지도록 1증가 연산자 사용
		}                                               	//i++; 없으면 무한반복...
		System.out.println("반복이 끝났습니다.");
	}

}
