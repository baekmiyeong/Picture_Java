package p_07_Array;

import java.io.*;

public class Sp09_2 {
//배열 정렬하기(★★) 	//출력 테스트용
	public static void main(String[] args) throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);	//입력받은 인원수
		int [] test = new int[num];
		
		System.out.println(test.length + "명의 점수를 입력하십시오.");
		
		for(int i=0; i<test.length; i++) {	// 점수를 저장하는 로직 //
			str = br.readLine();
			test[i] = Integer.parseInt(str);
			
			System.out.println("test[i]:"+test[i]);
		}
		System.out.println("오름차순정렬 : 1, 내림차순정렬 : 2 선택하세요!");
		str = br.readLine();
		
		// 배열 정렬하는 로직 //
		for(int f=0; f<test.length-1; f++) {	//앞의 숫자
			for(int b=f+1; b<test.length; b++) {	//뒤의 숫자
				System.out.println("f:" + f + "\t" + "test[f]:" + test[f] + 
						"\t" + "b:" + b + "\t" + "test[b]:" + test[b]);
				switch(str) {
					case "1":
						if(test[f] > test[b]) {	//오름차순
							System.out.println("숫자 체인지!!!!");
							int tmp = test[b];
							test[b] = test[f];
							test[f] = tmp;		
						} else {
							System.out.println("그대로!!!!!");
							break;
						}
					case "2":
						if(test[f] < test[b]) {	//내림차순
							System.out.println("숫자 체인지!!!!");
							int tmp = test[b];
							test[b] = test[f];
							test[f] = tmp;		
						} else {
							System.out.println("그대로!!!!!");
							break;
						}
				}
			}	
		}
		
		for(int j=0; j<test.length; j++) {	// 출력 부분 //
			System.out.println((j+1) + "번째 사람의 점수는 " + test[j] + "입니다.");
		}
	}

}
