package test.algorithms.programmers;
import java.util.Arrays;

public class LongTypeSort {

	public static void main(String[] args) {
		System.out.println(new LongTypeSort().solution(123459));
	}
	
	public long solution(long n) {
		long answer = 0;
		
		String sAnswer = String.valueOf(n);
		int[] arr = new int[sAnswer.length()];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(sAnswer.charAt(i)) - 48;
		}
		
		int temp;
		int max;
		
		for(int i = 0; i < arr.length - 1; i++){
			max = i;
			
			for(int j = i + 1; j < arr.length; j++){
				if(arr[max] < arr[j]){
					max = j;
				}
			}    
			temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;   
		}
		
		sAnswer = Arrays.toString(arr).replaceAll("[^0-9]","");
		
		answer = Long.parseLong(sAnswer);
		
		return answer;
	}

}
