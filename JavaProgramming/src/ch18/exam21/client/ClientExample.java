package ch18.exam21.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class ClientExample {
	private static Socket socket=new Socket();
	private static boolean stop;
	
	public static void main(String[] args) {
		//소켓생성
		Socket socket=new Socket();
		
		try {//연결 요청하기
			SocketAddress sa=new InetSocketAddress("192.168.0.7", 5001);
			socket.connect(sa);
			System.out.println("[서버와 연결됨]");
			
			Thread thread=new Thread(){
				@Override
				public void run() {
					sendAndReceive();
				}
			};
			thread.start();
		}catch(IOException e){
			System.out.println("서버연결이안됨");
		}
	}
		
	private static void sendAndReceive(){
		try{
			while(!stop){
			//보낼 데이터를 키보드로 읽기
			Scanner scanner=new Scanner(System.in);
			System.out.print("명령어 입력 [send or stop] : ");
			String data=scanner.nextLine();
			
				if(data.equals("send")){
					System.out.print("보낼 데이터 : ");
					data=scanner.nextLine();
				
					//서버로 데이터를 보내기
					OutputStream os=socket.getOutputStream();
					byte[] sendvalues=data.getBytes("UTF-8");
					if(socket.isConnected()){
						os.write(sendvalues);
						os.flush();
					}else{
						System.out.println("[연결이 되어있지않습니다.]");
					}
					//서버에서 보낸 데이터를 읽기
					InputStream is=socket.getInputStream();
					byte[] receiveValues=new byte[1024];
					int byteNum=is.read(receiveValues);
					data=new String(receiveValues, 0, byteNum, "UTF-8");
					System.out.print(data);
				}
				else if(data.equals("stop")){
					clientStop();
				}
			}
		}
		catch(Exception e){
			System.out.println("[서버 연결이 끊어졌습니다.]");
		}
	}
			
	private static void clientStop(){
		try{
			stop=true;
			socket.close();
			System.out.println("[클라이언트의 정상종료]");
				
		}catch(Exception e){}
	}
}
