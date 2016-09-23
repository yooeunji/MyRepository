package ch18.exam20.server;

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
		
		System.out.println("서버 연결");
		
		try{  //서버의 어떤 IP라도 접근할수있도록 한것
			serverSocket=new ServerSocket(5001);  //5001번 포트번호	
			Thread thread=new Thread(){
			
			@Override
			public void run() {
				try {
					waitAndAccept();
				} catch (IOException e) {
				}
			}

			private void waitAndAccept() throws IOException {
				while(!stop){
					Socket socket=serverSocket.accept();
					for(int i=0; i<10; i++){
					//클라이언트의 연결을 수락하고 통신용 Socket을 생성
					  //여기서 블로킹이되면 main스레드에서 다른 처리를 볼수가없으므로 별도의 스레드 처리를해서 
						
					//클라이언에서 보낸 데이터 받기
					InputStream is=socket.getInputStream();
					byte[] receiveValues=new byte[1024];
					int byteNum=is.read(receiveValues);
					String data=new String(receiveValues, 0, byteNum, "UTF-8");
					System.out.println(data);
						
					//클라이언트로 에코 보내기
					OutputStream os=socket.getOutputStream();
					byte[] sendvalues=data.getBytes("UTF-8");
					os.write(sendvalues);
					os.flush();
					
					
					}
				//클라이언트의 연결을 끊음
					socket.close(); 
				}
			}};
			thread.start();
			
			
		}catch(IOException e){
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
}
