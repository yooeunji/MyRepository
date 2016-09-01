package ch09.exam11;

public class Button {
	public static interface OnClickListener{
		void onClick(); //추상메소드
	}
	
	
	private OnClickListener onClickListener;
	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}


	public void click(){ //이 인터페이스를 구현한 객체를 매개변수로 줘야해
		if(onClickListener !=null){
			onClickListener.onClick();
		}
	}
}
//위임형 모델