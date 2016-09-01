package ch09.exam11;

public class ButtonExample {
	public static void main(String[] args){
		Button btnOk=new Button();
		btnOk.setOnClickListener(new Button.OnClickListener(){ 
		
		@Override
		public void onClick(){
			System.out.println("음악을 재생합니다");
		}
	});
		
		Button btnCancel=new Button();
		btnCancel.setOnClickListener(new Button.OnClickListener(){
		
		@Override
		public void onClick(){
			System.out.println("음악을 중지합니다");
			}
		});
		
		btnOk.click();
		btnCancel.click();
	}	
}

