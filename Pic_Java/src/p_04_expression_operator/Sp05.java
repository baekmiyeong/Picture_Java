package p_04_expression_operator;

public class Sp05 {
//전위, 후위 증가 연산자 사용하기(★) 
	public static void main(String[] args) {
		//int a=0, b = 0;		
		int a = 0; 
		int b = 0;
		System.out.println("현재 a와 b의 값은 " + a + "\t" + b + "입니다.\n");
		
		b = ++a;          //전위 증가 연산자
		System.out.println("대입 전에(전위) 증가 연산자를 사용했습니다.");
		System.out.println("a의 값은 " + a + "이고, b의 값은 " + b + "입니다.\n");
		
		b = a++;          //후위 증가 연산자
		System.out.println("대입 후에(후위) 증가 연산자를 사용했습니다.");
		System.out.println("a의 값은 " + a + "이고, b의 값은 " + b + "입니다.");
	}

}