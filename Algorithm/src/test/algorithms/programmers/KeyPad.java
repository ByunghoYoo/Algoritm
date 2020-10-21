package test.algorithms.programmers;

import java.awt.Point;

public class KeyPad {

	/*
	 * 출처 : https://programmers.co.kr/
	 * 1. 엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있으며 키패드 이동 한 칸은 거리로 1에 해당합니다.
       2. 왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용합니다.
       3. 오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용합니다.
       4. 가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용합니다.
       4-1. 만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼손 엄지손가락을 사용합니다.
	 */
	public static void main(String[] args) {
		System.out.println(algorithms(new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
		// LRLLLRLLRRL
		//System.out.println(algorithms(new int[] {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
		// LRLLRRLLLRR
		//System.out.println(algorithms(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));
		// LLRLLRLLRL
	}
	
	public static String algorithms(int[] numbers, String hand) {
		// x,y 좌표 공간에서 위치를 알기 위해 Point 객체 생성
		Point[] nums = new Point[10];
		// 번호패드와 같이 초기화
		nums[0] = new Point(3, 1);
		nums[1] = new Point(0, 0);
		nums[2] = new Point(0, 1);
		nums[3] = new Point(0, 2);
		nums[4] = new Point(1, 0);
		nums[5] = new Point(1, 1);
		nums[6] = new Point(1, 2);
		nums[7] = new Point(2, 0);
		nums[8] = new Point(2, 1);
		nums[9] = new Point(2, 2);
		Point L = new Point(3, 0); // *부터 시작하며 계속해서 현재 왼쪽 손가락의 위치를 나타냄
		Point R = new Point(3, 2); // #부터 시작하며 계속해서 현재 오른쪽 손가락의 위치를 나타냄
		
		// 어느 손으로 눌렀는지 계속해서 값을 축적하기 위해 StringBuilder 객체 생성
		StringBuilder sb = new StringBuilder(); 
		
		for(int key : numbers) {
			if(key == 1 || key == 4 || key == 7) {
				L.x = nums[key].x;
				L.y = nums[key].y;
				sb.append("L");
			}
			else if(key == 3 || key == 6 || key == 9) {
				R.x = nums[key].x;
				R.y = nums[key].y;
				sb.append("R");
			}
			else {
				// 현재 손의 위치에서 누르려는 키패드의 위치가 멀면 멀수록 dis의 값은 커진다.
				int disL = Math.abs(L.x - nums[key].x) + Math.abs(L.y - nums[key].y);
				int disR = Math.abs(R.x - nums[key].x) + Math.abs(R.y - nums[key].y);
				
				if(disL == disR) {
					if(hand == "left") {
						L.x = nums[key].x;
						L.y = nums[key].y;
						sb.append("L");
					} else {
						R.x = nums[key].x;
						R.y = nums[key].y;
						sb.append("R");
					}
				} else {
					if(disL > disR) {
						// 오른손이 더 가깝다면
						R.x = nums[key].x;
						R.y = nums[key].y;
						sb.append("R");
					} else {
						// 왼손이 더 가깝다면
						L.x = nums[key].x;
						L.y = nums[key].y;
						sb.append("L");
					}
				}
			}
		}
		return sb.toString();
	}
	
}
