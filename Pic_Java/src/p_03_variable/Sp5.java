package p_03_variable;

import java.io.*;

public class Sp5 {
//숫자를 입력하기
	public static void main(String[] args) throws IOException {
		System.out.println("정수를 입력하십시오");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();	                    //키보드로 입력한 문자열 str에 저장
		
		int num = Integer.parseInt(str);                //문자열을 변환하여 int형 변수에 저장
		
		System.out.println(num + "(이)가 입력되었습니다.");  //입력된 문자열 출력
	}

}
