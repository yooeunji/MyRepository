package ch11.hw11; //11장 확인문제 8번

import java.util.StringTokenizer;

public class splitExample {

	public static void main(String[] args) {
		
		String str="아이디,이름,패스워드";
		//split() 메소드 이용
		String[] info=str.split(",");
		
		for(String s: info){
			System.out.println(s);
		}
		System.out.println();
		
		
		//StringTokenizer 이용
		StringTokenizer st=new StringTokenizer(str, ",");
		while(st.hasMoreTokens()){
			String token=st.nextToken();
			System.out.println(token);
		}
				
	}

}
