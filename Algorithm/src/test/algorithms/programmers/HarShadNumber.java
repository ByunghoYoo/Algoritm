package test.algorithms.programmers;

public class HarShadNumber {

	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(12));
		System.out.println(solution(11));
		System.out.println(solution(13));
	}
	
    public static boolean solution(int x) {
        boolean answer = true;
        
        String y = String.valueOf(x);
        int z = 0;
        
        for(int i = 0; i < y.length(); i++) {
            z += (int)(y.charAt(i)) - 48;
        }
        
        if(x % z != 0) answer = false;
        
        return answer;
    }
}
