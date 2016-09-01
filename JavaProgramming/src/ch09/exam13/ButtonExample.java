package ch09.exam13;

public class ButtonExample {
	public static void main(String[] args){
		Button btnOk=new Button();
		
		int value=10;
		
		btnOk.setOnClickListener(new Button.OnClickListener(){  //local클래스
		
		@Override
		public void onClick(){
			//value=5; <-★ final 특성 갖기때문에 안된다. 읽기만가능
			System.out.println("음악을 재생합니다");
		}
	});
		
		btnOk.click();
		
	}	
}

