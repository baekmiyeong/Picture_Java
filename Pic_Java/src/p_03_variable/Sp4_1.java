package p_03_variable;

import java.io.*;

public class Sp4_1 {
//키보드로 입력하기(BufferedReader 사용)
	public static void main(String[] args) throws IOException {
		System.out.println("문자열을 입력하십시오");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();	                    //키보드로 입력한 문자열 str에 저장
		
		System.out.println(str + "(이)가 입력되었습니다.");  //입력된 문자열 출력
	}

}