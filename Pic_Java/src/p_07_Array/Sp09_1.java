package p_07_Array;

import java.io.*;

public class Sp09_1 {
//배열 정렬하기(★★)
	public static void main(String[] args) throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int [] test = new int[5];
		
		System.out.println(test.length + "명의 점수를 입력하십시오.");
		
		for(int i=0; i<test.length; i++) {	// 점수를 저장하는 로직 //
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
		}
		
		for(int s=0; s<test.length-1; s++) {	// 배열 정렬하는 로직 //
			for(int t=s+1; t<test.length; t++) {
				if(test[t] > test[s]) {	//비교로직
					int tmp = test[t];
					test[t] = test[s];
					test[s] = tmp;
				}
			}
		}
		
		for(int j=0; j<test.length; j++) {	// 출력 부분 //
			System.out.println((j+1) + "번째 사람의 점수는 " + test[j] + "입니다.");
		}
	}

}
