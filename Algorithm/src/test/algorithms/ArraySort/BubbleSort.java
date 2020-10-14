package test.algorithms.ArraySort;

public class BubbleSort {

	public static void main(String[] args) {
		// 거품 정렬 (Bubble Sort)
		// 인접한 두 개의 값을 비교하여 더큰 값을 우측으로 보내는 알고리즘
		// 이미 정렬이 어느정도 되어 있는 데이터에 대한 수행 속도가 매우 빠르며 구현이 쉽다.
		// 단, 역순으로 정렬이 되어 있는 경우 시간 복잡도가 제곱수 배로 증가하여 효울이 급격하게 떨어진다. O(n^2)
		
		int[] arr = {2, 4, 1, 3, 5, 6};
		int tmp = 0;  // 교환을 위한 임시 변수
		
		for(int i = arr.length -1; i > -1; i--) {
			for(int j = 0; j < i; j++) {
				
				if(arr[j] > arr[j + 1]) {
					// 앞의 순번의 값이 더 크기 때문에 자리를 교환한다.
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		// 정렬 결과 확인
		System.out.print("정렬 결과 확인 : ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
