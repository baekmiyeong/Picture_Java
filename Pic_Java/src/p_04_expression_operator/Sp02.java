package p_04_expression_operator;

public class Sp02 {
//변수의 값을 사용하기
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		int sum = num1 + num2;            //더한 값을 sum에 대입
		
		System.out.println("변수 num1의 값은 " + num1 + "입니다.");
		System.out.println("변수 num2의 값은 " + num2 + "입니다.");
		System.out.println("num1+num2의 값은 " + sum + "입니다.");
		                                  //피연산자 변수
		num1 = num1 + 1;
		
		System.out.println("변수 num1의 값에 1을 더하면 " + num1 + "입니다.");
	}

}