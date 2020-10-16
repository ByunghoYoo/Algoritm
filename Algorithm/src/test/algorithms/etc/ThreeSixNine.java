package test.algorithms.etc;

import java.util.Scanner;

public class ThreeSixNine {

	public static void main(String[] args) {		
		//실행 횟수
        int count;
        //박수 횟수 저장
        //int clap = 0;
        
        System.out.print("진행 횟수 입력 : ");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        
        //chkNum 실행 값의 시작
        for(int i = 1 ; i <= count; i++) {
            
            //문자열로 형변환
            String strCnt = String.valueOf(i);
            System.out.print("번호 : " + strCnt + " - ");
            
            //형변환된 값의 길이 만큼 반복
            for(int j = 0; j < strCnt.length(); j++) {
                
                char chk = strCnt.charAt(j);
                if(chk == '3' || chk == '6' || chk == '9') {
                	//clap++;
                	System.out.print("짝");
                }
            }
            
            System.out.println("");
        }
        //System.out.println("박수 횟수 : " + clap);
    }
}
