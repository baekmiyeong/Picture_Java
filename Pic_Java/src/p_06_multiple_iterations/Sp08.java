package p_06_multiple_iterations;

public class Sp08 {
//if 문 등과 조합하기(★)
	public static void main(String[] args) {
		boolean bl = false;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(bl == false) {
					System.out.print("*");
					bl = true;
				} else {
					System.out.print("-");
					bl = false;
				}
			}
			System.out.print("\n");
		}
	}

}
