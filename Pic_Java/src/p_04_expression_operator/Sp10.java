package p_04_expression_operator;

public class Sp10 {
//다른 형의 변수와 연산하기
	public static void main(String[] args) {
		int d = 2;
		double pi = 3.14;
		
		System.out.println("지름이 "+ d +"센티미터의 원의");
		System.out.println("둘레는 "+ (d*pi) + "센티미터 입니다.");
		                        //int형 변수가 double형으로 변환되어 연산
		
		//피연산자 크기를 비교해 큰 데이터형으로 형변환 후, 연산 수행
	}

}
