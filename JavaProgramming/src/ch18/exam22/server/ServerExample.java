package ch18.exam22.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerExample { //스레드풀이용
	
	private static ServerSocket serverSocket;
	private static boolean stop;
	private static ExecutorService executorService;	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("서버 시작");
		
		try{
			//스레드 풀 생성
			executorService=Executors.newFixedThreadPool(50); //스레드가 50개 담겨있는데 스레드 풀 생성
			
			
			//서버의 어떤 IP라도 접근할수있도록 한것
			serverSocket=new ServerSocket(5001);  //5001번 포트번호	
		
			//클라이언트의 연결을 수락하는 작업 생성
			Runnable runnable=new Runnable(){
			@Override
			public void run() {
				waitAndAccept();
			} 
			};
			executorService.submit(runnable);
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
				executorService.shutdown();
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
					//통신을 담당하는 객체(Client객체)생성
					Client client=new Client(socket);
				}			
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	
	
		static class Client{
			Socket socket;
			public Client(Socket socket)
			{	
				this.socket=socket;
				receive();
			}
				
			public void receive(){  //데이터올때까지 기다리고있다가 블로킹될수가있으므로 이 메소드를 메인스레드와 다른 스레드에서 구현
			
				//클라이언트의 데이터를 받고 에코 보내기를 하는 작업 생성
				Runnable runnable=new Runnable(){
					@Override
					public void run() {
							
						try {
							while(true){
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
								}else {
									break;
								}
							}	
						}catch(IOException e) {
							System.out.println("클라이언트가 비정상 종료됨");
						}	
				
						try{
							//클라이언트의 연결을 끊음
							socket.close();
						}catch(IOException e){}
						}
				};

				//작업을 스레드풀의 작업큐에 넣기
				executorService.submit(runnable);
			}
		}
	}
