package ch18.exam17.client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class ClientExample {

	public static void main(String[] args) {
		//소켓생성
		Socket socket=new Socket();
		
		
		//연결 요청하기
		try {
			SocketAddress sa=new InetSocketAddress("192.168.0.7", 5001);
			socket.connect(sa);
			System.out.println("[서버와 연결됨]");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//나는 서버와 연결하지않겠다.
		try {
			socket.close();
		} catch (IOException e) {
		}
	}
}
