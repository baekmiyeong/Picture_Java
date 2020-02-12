package p_05_case_by_case_processing;

import java.io.*;

public class Sp3 {
//if~else 문 사용하기
	public static void main(String[] args) throws IOException {
		System.out.println("정수를 입력하십시오.");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		if(res == 1) {                                           //if(조건)
		    System.out.println("1이 입력되었습니다.");            //문장1;
			//조건 참일때 문장수행
		}
		else {                                                   //else
		    System.out.println("1 이외의 값이 입력되었습니다.");    //문장2;
			//조건 거짓일때 문장수행
		}
	}

}
