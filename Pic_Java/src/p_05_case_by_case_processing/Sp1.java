package p_05_case_by_case_processing;

import java.io.*;

public class Sp1 {
//if 문 사용하기
	public static void main(String[] args) throws IOException {
		System.out.println("정수를 입력하십시오.");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);               //변수 res에 키보드입력을 저장
		
		if(res == 1)                                   //if(조건)
		    System.out.println("1이 입력되었습니다.");   //문장;
			//조건 참일때 문장수행
		System.out.println("처리를 종료합니다.");
	}

}
