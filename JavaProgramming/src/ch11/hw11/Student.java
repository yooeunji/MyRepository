package ch11.hw11; //11장 확인문제 3번

public class Student {
	private String studentNum;
	
	public Student(String studentNum){
		this.studentNum=studentNum;
	}
	
	public String getStudentNum(){
		return studentNum;
	}
	
	@Override
	public int hashCode() {
		
		return Integer.parseInt(studentNum);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student){
			Student student=(Student)obj;
			if(studentNum.equals(student.studentNum)){
				return true;
			}
		}
		return false;
	}
}
