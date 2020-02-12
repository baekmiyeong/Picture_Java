package p_07_Array;

import java.io.*;

public class Sp02 {
//배열의 요소의 개수를 입력하기
	public static void main(String[] args) throws IOException {
		System.out.println("시험 응시자의 수를 입력하십시오.");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);	//시험 응시자 수  //요소 수
		
		int [] test;
		test = new int[num];	//시험 응시자 수만큼 배열생성  //배열 요소 생성
		
		System.out.println("시험 응시자 수 만큼 점수를 입력하십시오.");
		
		for(int i=0; i<num; i++) {	// 연산부분 //
			str = br.readLine();
			int tmp = Integer.parseInt(str);	//시험 점수
			test[i] = tmp;		//배열요소에 점수를 저장
		}
		
		for(int i=0; i<num; i++) {	// 출력부분 //
			System.out.println((i+1) + "번째 사람의 점수는 " + test[i] + "입니다.");	
		}
	}

}
