package ch12.exam03;

public class Calculator {
	private int memory;
	
	public int getMemory(){
		return memory;
}

public synchronized void setMemory(int memory){ //USER1이 완전이 이 메소드를 사용하기 전까진 USER2는 이용할수없다.
	this.memory=memory;
	try{
		Thread.sleep(2000);
	}catch(InterruptedException e){}
	System.out.println(Thread.currentThread().getName()+":"+this.memory);
	}

	/*public void setMemory(int memory){ //USER1이 완전이 이 메소드를 사용하기 전까진 USER2는 이용할수없다.
		
	    synchronized(this){  //동기화 불록, 메스드 내용의 일부분만 동기화시킬수있다.
		this.memory=memory;
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){}
		System.out.println(Thread.currentThread().getName()+":"+this.memory);
	    }*/
	//public synchronized void method(){}  -> user1이 setMemory를사용하고있을때 user2는 이것마저사용못한다.
										  //한 user가 싱크로나이즈 메소드를 사용하고있으면 그 메소드의 클래스중 싱크로나이즈 메소드는 다 락이 걸려버린다
}
