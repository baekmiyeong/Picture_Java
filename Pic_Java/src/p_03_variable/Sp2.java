package p_03_variable;

public class Sp2 {
//변수의 값을 바꾸기
	public static void main(String[] args) {
		int num;        //변수 선언
		num = 3;        //값 할당(대입)
				
		System.out.println("변수 num의 값은 " + num + "입니다.");
		                                //변수값 출력
		num = 5;        //새로운 값 대입
		
		System.out.println("변수의 num의 값을 변경했습니다.");
		System.out.println("변수 num의 값은 " + num + "입니다.");
	}

}