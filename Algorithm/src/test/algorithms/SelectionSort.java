package test.algorithms;

public class SelectionSort {

	public static void main(String[] args) {
		// 선택 정렬 (Selection Sort)
		// 기존의 배열을 전부 탐색하여 가장 작은 값(최소값)을 찾고, 그 값을 왼쪽부터 채워 나가는 방식
		//
		// ** 정렬 알고리즘
		// 정렬하고자 하는 데이터 양에 비해 소요되는 시간적 성능적 요소를 판단하는 규칙을 판단하는 규칙
		// 선택 정렬은 데이터의 양이 적을 때는 좋은 성능을 가지지만(시간적 복잡도)
		// 배열의 길이가 클 때 (데이터의 양이 많을 때) 성능이 급격하게 저하된다.
		
		int[] arr = {2, 4, 1, 3, 5, 6};
		
		int min;  // 최소값을 가진 배열의 순번을 저장하는 변수
		int tmp;  // 값 교환용 임시 변수

		for(int i = 0; i < arr.length -1; i++) {
			// 배열을 처음부터 끝까지 반복할 때
			// 가장 작은 값을 가진 순번을 찾아
			//  내부에서 반복문 통해 왼쪽부터 하나씩 비교 및 교환한다.
			
			min = i; // 첫번째 숫자와 그 외의 숫자를 다음 for문에서 비교 및 정렬후, 
			         // 두번째 숫자와 그 외의 숫자를 비교하기 위해 min을 i로 바꾸어 준다.
			
			for(int j = i + 1; j < arr.length; j++) {
				// 현재 순번의 다음값부터 최소값을 찾아 비교하기 위해
				// i + 1로 시작한다.
				
				// 최소값 찾기
				if(arr[min] > arr[j]) {
					min = j;
				}

			}
			
			// 값 교환 진행
			tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;

		}
		
		System.out.print("정렬 후 : ");
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

	}

}
