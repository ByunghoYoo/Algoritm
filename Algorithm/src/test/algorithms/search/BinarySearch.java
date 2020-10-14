package test.algorithms.search;

public class BinarySearch {

	public static void main(String[] args) {
		// 찾고자 하는 원소들 
        int[] arr = { 3, 19, 34, 50, 87 };
 
        // 찾고자 하는 KEY값 
        int key = 87;
 
        binarySearch(arr, key);
	}
	
	private static void binarySearch(int[] arr, int key) {
		   
	        // 배열의 첫번째 인덱스 값
	        int left = 0;
	 
	        // 배열이라서 -1함
	        int right = arr.length - 1;
	        int mid;
	 
	        while (left <= right) {
	 
	            // 중앙값을 계산한다 
	            mid = (left + right) / 2;
	 
	            if (key == arr[mid]) {
	                System.out.println(key + "값의 Array Index 위치 : " + mid);
	                break;
	            }
	 
	            // 찾고자 하는 KEY값이 배열의 중앙값보다 작을경우 
	            if (key < arr[mid]) {
	 
	                // 데이터는 왼쪽에 위치함으로 right를 mid에서 1을 뺀 값으로 변경
	                right = mid - 1;
	            }
	 
	            // 찾고자 하는 KEY값이 배열의 중앙값보다 클 경우 
	            else {
	 
	                // 데이터는 오른쪽에 위치함으로 left값을 mid에서 1을 더한 값으로 변경
	                left = mid + 1;
	            }
	        }
	    }
}
