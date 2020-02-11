package p_04_expression_operator;

//화면에 출력하는 코드를 작성하시오
public class Ex2 {

	public static void main(String[] args) {
		//Hint! 좌변이든 우변이든 한쪽만 double형으로 형변환
		
		int ans1 = 0 - 4;
		double ans2 = 3.14 * 2;
		double ans3 = (double)5 / 3; 
		int ans4 = 30 % 7;
		double ans5 = (7+32) / (double)5;
		
		System.out.println("0-4는 " + ans1 + "입니다.");
		System.out.println("3.14*2는 " + ans2 + "입니다.");
		System.out.println("5/3은 " + ans3 + "입니다.");
		System.out.println("30/7의 나머지 값은 " + ans4 + "입니다.");
		System.out.println("(7+32)/5는 " + ans5 + "입니다.");
	}

}
