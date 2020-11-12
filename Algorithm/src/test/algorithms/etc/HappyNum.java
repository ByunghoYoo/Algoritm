package test.algorithms.etc;

import java.util.ArrayList;
import java.util.Scanner;

public class HappyNum {
	
	static int first = 0;	// 처음 수 보존하기 위한 전역변수
	static int count = 0;	// 행복수의 갯수를 나타내기 위한 전역변수
	static int total = 0;	// 행복수의 총합을 나타내기 위한 전역변수
	ArrayList<Integer> list = new ArrayList<Integer>();	// 순환 수 확인하기 위한 list
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("최대값을 입력하세요 : " );
		int range = sc.nextInt();
		
		for(int i = 1; i <= range; i++) {
			first = i;
			new HappyNum().chkHappy(i);
			
			if(i == range) {
				System.out.printf("1 ~ %d 범위의 행복 수는 %d개이고 총합은 %d입니다.", range, count, total);
			}
		}
		
		/*
		for(int i = 1; i <= 99; i++) {
			first = i;
			new HappyNum().chkHappy(i);
		}
		System.out.printf("행복 수는 %d개이고 총합은 %d입니다.", count, total);
		*/
	}

	public int chkHappy(int num) {
		// 1일 경우
		if(num == 1) {
			total += num;
			count++;
			return 0;
		}
		
		// 순환되는 수를 비교해야 하기 때문에 list 사용
		list.add(num);

		// 각 자리수의 제곱의 합을 나타내기 위한 코드
		String sNum = String.valueOf(num);
		int hap = 0;
		
		for(int i = 0; i < sNum.length(); i++) {
			int j = (int)(sNum.charAt(i)) - 48;
			
			hap += j*j;
		}
		
		// 순환되는지 확인하는 코드
		for(int i = 0; i < list.size(); i++) {
			if(hap == list.get(i)) {
				System.out.println("슬픈수 : " + list.get(0));
				list.removeAll(list);
				return 0;
			}
		}
		
		// 순환이 되지 않는다면 1일 경우엔 행복수이고 아닐 경우엔 재귀함수 호출
		if(hap == 1){
			System.out.println("행복수 : " + list.get(0));
			count++;
			total += list.get(0);
			list.removeAll(list);
			return 0;
		} else {
			chkHappy(hap);
		}
		
		return 0;
	}
}
