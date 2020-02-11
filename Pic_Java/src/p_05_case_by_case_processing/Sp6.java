package p_05_case_by_case_processing;

import java.io.*;

public class Sp6 {
//switch 문에서 문자로 분기하기
	public static void main(String[] args) throws IOException {
		System.out.println("a 혹은 b를 입력하십시오.");
			
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char res = str.charAt(0); 
		//charAt : 입력한 문자열에서 문자를 추출
		switch(res) {
			case 'a':		//문자''
				System.out.println("a가 입력되었습니다.");
				break;
			case 'b':
				System.out.println("b가 입력되었습니다.");
				break;
			default:
				System.out.println("a 혹은 b를 입력하십시오.");
				break;
		}
	}

}
