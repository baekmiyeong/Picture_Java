package p_07_Array;

import java.io.*;

public class Sp09_2 {
//배열 정렬하기(★★) 	//출력 테스트용
	public static void main(String[] args) throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int [] test = new int[5];
		
		System.out.println(test.length + "명의 점수를 입력하십시오.");
		
		for(int i=0; i<test.length; i++) {	// 점수를 저장하는 로직 //
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
			
			System.out.println("test[i]:"+test[i]);
			//System.out.println(i + "\t" + test[i] + "\t" + test.length);
		}
		
		// 배열 정렬하는 로직 //
		for(int s=0; s<test.length-1; s++) {	//앞의 숫자
			for(int t=s+1; t<test.length; t++) {	//뒤의 숫자
				System.out.println("\n"+"s:"+s+"\t"+"test[s]:"+test[s]+"\t"+
			"t:"+t+"\t"+"test[t]:"+test[t]);
				if(test[t] > test[s]) {	//비교로직
						System.out.println("숫자 체인지!!!!");
					int tmp = test[t];
					test[t] = test[s];
					test[s] = tmp;
				} else System.out.println("그대로!!!!!");
			}
		}
		
		for(int j=0; j<test.length; j++) {	// 출력 부분 //
			System.out.println((j+1) + "번째 사람의 점수는 " + test[j] + "입니다.");
		}
	}

}
