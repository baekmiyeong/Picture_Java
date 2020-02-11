package p_03_variable;

import java.util.*;

public class Sp4_2 {
//키보드로 입력하기(Scanner 사용)
	public static void main(String[] args) {
		System.out.println("문자열을 입력하십시오");
		
		Scanner sc = new Scanner(System.in);
		//문자열일경우
		String kbd = sc.next();	                        //키보드로 입력한 문자열 str에 저장
		
		System.out.println(kbd + "(이)가 입력되었습니다.");  //입력된 문자열 출력
		
		//숫자일경우
		System.out.println("숫자를 입력하십시오");
		int su1 = sc.nextInt();	                        //파싱작업됨
		int su2	= Integer.parseInt(sc.next());          //직접 파싱작업함
		
		System.out.println(su1 + "\t" + su2 + "(이)가 입력되었습니다.");
	}

}