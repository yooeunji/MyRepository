package ch11.exam09;

public class NewInstanceExample {

	public static void main(String[] args) throws Exception{
		Class clazz=Class.forName("ch11.exam09."+args[0]);
		Object obj=clazz.newInstance(); //args[0]에 들어온 구현 클래스의 객체를 만들어줄거야, newInstance()는 디폴트 생성자만 찾아서 객체를 만든다.
		Action action=(Action)obj;  //큰객체를작은객체에 대입할때 강제변환해야해
		action.execute();
	}

}
