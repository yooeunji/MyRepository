package ch07.exam12;

public class Theater {
	

	   public void check(Person person) {
	      if ( person instanceof Adult ) {
	         Adult adult = ( Adult ) person;
	         System.out.println("주민번호 : " + adult.ssn);
	      }
	      
	      if ( person instanceof Student ) {
	         Student student = ( Student ) person;
	         System.out.println("학생번호 : " + student.sno);
	         
	      }
	   }

}



