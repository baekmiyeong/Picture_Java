package p_03_variable;

public class Sp1 {
//변수를 사용하기
	public static void main(String[] args) {
		//변수 사용규칙
		//길이제한X, 키워드(class..) 사용X, 숫자로 시작X
		//알파벳 대문자 소문자 구분됨, 특수문자 _와 $만 사용O 
		
		//형명 식별자;
		int num;             //변수 선언
		num = 3;             //값 할당(대입)
		
		//형명 식 = 식;
		//int num = 3;       //변수의 초기화
		//선언과 대입을 동시에 진행 
		
		System.out.println("변수 num의 값은 " + num + "입니다.");
		                                 //변수값 출력
	}

}