package p_05_case_by_case_processing;

import java.io.*;

public class Sp5 {
//switch 문 사용하기
	public static void main(String[] args) throws IOException {
		System.out.println("정수를 입력하십시오.");
			
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
			
		switch(res) {										//switch(식)
			case 1:											//case 값1:
				System.out.println("1이 입력되었습니다.");		//문장1;
				//경우(값) 1일때 문장수행							//break;
				break;
			case 2:                                          //case 값2:
				System.out.println("2이 입력되었습니다.");        //문장2;
				//경우(값) 2일때 문장수행                                               //break;
				break;
			default:										//default: //생략가능
				System.out.println("1 혹은 2를 입력하십시오.");	//문장D;
				//그 이외의 경우 문장수행							//break;
				break;
		}
	}	

}
