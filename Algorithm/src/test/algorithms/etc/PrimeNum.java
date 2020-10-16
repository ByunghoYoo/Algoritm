package test.algorithms.etc;

public class PrimeNum {

	public static void main(String[] args) {
		
		int count = 0; // 소수가 몇개인지 카운트

          for(int i = 2; i <= 100; i++) // 1은 소수가 아니므로 2부터 시작
          {
              for(int j = 2; j <= i; j++)
              {
                   if(i % j == 0) 
                   {
                        count++; // count가 2개 이상 올라갔다면 소수가 아님 
                   }    
              }
              
              if(count == 1) // 소수는 1과 자기자신으로만 나눠지는데 2부터 나눈 나머지가 0인 것을 카운트하므로 count가 1이라면 소수
              {
                   System.out.print(i + " ");
              }
              count = 0; // 다시 count를 0으로 만들어 다음 숫자에 대한 count 준비
          }

	}

}
