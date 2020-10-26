package test.algorithms.etc;

public class HappyNum {
	
	static int first = 0;
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 13; i++) {
			first = i;
			new HappyNum().chkHappy(i);
			// 처음 숫자로 순환이 안되는 수가 있다.. list 사용해서 해봐야할거같다
		}
	}

	
	public int chkHappy(int num) {
		String sNum = String.valueOf(num);
		int hap = 0;
		
		for(int i = 0; i < sNum.length(); i++) {
			int j = (int)(sNum.charAt(i)) - 48;
			
			hap += j*j;
		}
		
		if(hap == first) {
			System.out.println("슬픈수 : " + sNum);
			return 0;
		} else if(hap == 1){
			System.out.println("행복수 : " + sNum);
			return 0;
		} else {
			chkHappy(hap);
		}
		
		return 0;
	}
	
	
	

}
