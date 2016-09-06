package ch11.hw11; //11장 확인문제 6번

public class ByteToStringExample {

	public static void main(String[] args) {
		byte[] bytes={73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
		String str=new String(bytes, 0, 10); //byte배열 0부터 길이 10까지 string문자열로 변환
		System.out.println(str);
	}

}
//출력 I love you