package p_04_expression_operator;

public class Sp09 {
//작은 데이터형에 변수에 대입하기 	//cast연산자 이용한 형변환
	public static void main(String[] args) {
		double dnum = 160.5;
		System.out.println("키는 " + dnum + "센티미터 입니다.");
		
		System.out.println("int형 변수에 대입합니다.");
		int inum = (int)dnum;            //작은 사이즈 형에는 대입할 수 없다 
		         //() 캐스트 연산자 사용
		
		System.out.println("키는 " + inum + "센티미터 입니다.");
	}

}
