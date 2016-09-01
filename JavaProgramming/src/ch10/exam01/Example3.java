package ch10.exam01;

public class Example3 {

	public static void main(String[] args) {
		try{
		String data1=args[0];
		String data2=args[1];
		
		int value1=Integer.parseInt(data1);
		int value2=Integer.parseInt(data2);
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("입력 된 수가 틀립니다.");
		}
		catch(NumberFormatException e){
			System.out.println("숫자를 입력하지않았습니다.");
		}
		catch(Exception e){
			System.out.println("예외 처리됨");
		}
	}

}
