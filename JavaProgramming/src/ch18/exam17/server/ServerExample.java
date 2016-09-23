package ch18.exam17.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {
		
		
		ServerSocket serverSocket=null;
		try{  //서버의 어떤 IP라도 접근할수있도록 한것
			serverSocket=new ServerSocket(5001);  //5001번의 포트번호를 가진 서버소켓 생성
			
			//서버의 특정 IP로 접근할수있도록 한것
			/*serverSocket=new ServerSocket();
			SocketAddress sa=new InetSocketAddress("192.168.0.7", 5001);
			serverSocket.bind(sa);*/
			
			for(int i=0; i<10; i++){
			//클라이언트의 연결을 수락하고 통신용 Socket을 생성
			System.out.println("클라이언트의 연결을 기다림");
			Socket socket=serverSocket.accept(); 
			String clientIP=socket.getInetAddress().getHostAddress();  //client의 IP를 얻고싶을때
			System.out.println("클라이언트 ("+clientIP+")의 연결을 수락함");
			
			//클라이언트의 연결을 끊음
			socket.close(); //해당클라이언트와 연결을 끊겠다.
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
			try {
				serverSocket.close();  //서버를 중지한다.
			} catch (IOException e) {
			}
	}

}
