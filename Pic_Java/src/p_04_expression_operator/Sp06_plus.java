package p_04_expression_operator;

public class Sp06_plus {
//좀 더 복잡한 연산자		//시프트 연산자
	public static void main(String[] args) {
		short sh = 5 << 2;
		//이진수로 변환한 5를 왼쪽으로 2자리 이동시키고 오른쪽을 0으로 채움
		System.out.println("왼쪽시프트(<<) 연산값 : " + sh);
		
		short sh2 = 5 >> 2;
		//이진수로 변환한 5를 오른쪽으로 2자리 이동시키고 왼쪽을 0으로 채움
		System.out.println("오른쪽시프트(>>) 연산값 : " + sh2);	
		//좌변의 값이 양수면 왼쪽을 0으로 채우고, 음수면 1로 채움
		
		short sh3 = (short) (-5 >>> 2);
		System.out.println("오른쪽시프트(>>>) 연산값 : " + sh3);	
		//좌변의 값이 양수이든 음수이든 관계없이 왼쪽을 0으로 채움
	}

}