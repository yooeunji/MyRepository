package ch18.exam21.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExample {
	
	
	private static ServerSocket serverSocket;
	private static boolean stop;
		
	public static void main(String[] args) {
		
		System.out.println("서버 시작");
		
		try{  //서버의 어떤 IP라도 접근할수있도록 한것
			serverSocket=new ServerSocket(5001);  //5001번 포트번호	
			Thread thread=new Thread(){
			
			@Override
			public void run() {
				waitAndAccept();
			} 
			};
			thread.start();
		}catch (IOException e) {
			e.printStackTrace();
		}
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("명령어 입력");
		String command=scanner.nextLine();
		if(command.equals("stop")){
			stop=true;
			
			try {
				serverSocket.close();  //서버를 중지한다.
			} catch (IOException e) {
				System.out.println("서버 exit");
			}
		}
	}
		private static void waitAndAccept() {
			try {
				while(!stop) {
					//클라이언트의 연결을 수락하고 통신용 Socket 을 생성
					Socket socket = serverSocket.accept();
					
					try {
						//클라이언에서 보낸 데이터를 받기
						InputStream is = socket.getInputStream();
						byte[] receiveValues = new byte[1024];
						int byteNum = is.read(receiveValues);
						if(byteNum != -1) {
							String data = new String(receiveValues, 0, byteNum, "UTF-8");
							//클라이언트로 에코 보내기	
							OutputStream os = socket.getOutputStream();
							byte[] sendValues = data.getBytes("UTF-8");
							os.write(sendValues);
							os.flush();
						}  else {
							System.out.println("클라이언트가 정상 종료됨");
						}
						//클라이언트의 연결을 끊음
						socket.close();
					} catch(IOException e) {
						System.out.println("클라이언트가 비정상 종료됨");
					}
				}			
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
			
	
}
