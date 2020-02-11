package p_04_expression_operator;

public class Sp08 {
//큰 사이즈의 데이터형에 대입하기(형변환)
	public static void main(String[] args) {
		int inum = 160;
		System.out.println("키는 " + inum + "센티미터 입니다.");
		
		System.out.println("double형 변수에 대입합니다.");
		double dnum = inum;          //큰 사이즈 형에 대입
		
		System.out.println("키는 " + dnum + "센티미터 입니다.");
	}

}
