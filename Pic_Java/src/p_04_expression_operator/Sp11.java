package p_04_expression_operator;

public class Sp11 {
//같은 형의 변수와 연산하기
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 4;
		
		double div = num1 / num2;
		System.out.println("5/4는 " + div +"입니다.");
		// 5/4는 1.25여야 하지만 num1,num2가 int형이므로 1.0이 됨
		
		double div2 = (double)num1 / (double)num2;
		System.out.println("5/4는 " + div2 +"입니다.");
		// cast연산자로 형변환 시켜서 1.25라는 값이 출력됨
	}

}
