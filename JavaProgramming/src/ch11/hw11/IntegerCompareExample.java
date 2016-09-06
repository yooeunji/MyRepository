package ch11.hw11; //11장 확인문제 10번

public class IntegerCompareExample {

	public static void main(String[] args) {
		Integer obj1=100;
		Integer obj2=100;
		Integer obj3=300;
		Integer obj4=300;
		
		System.out.println(obj1==obj2);  //true 출력
		System.out.println(obj3==obj4);  //false 출력
	}

}
/*박싱된 Integer객체를 ==연산자로 비교했을때 결과가 다르게 나오는 이유
==이 연산자는 박싱 객체의 내부를 비교하는 것이아니라 포장 객체의 참조를 비교한다.
내부의 값만 비교하려면 언ㄴ박싱한 값을 얻어 비교해야한다. 그러나 자바 언어 명세에 보면
다음과 같은 규칙이있다. 
byte나 short, int는 -128~127 사이의 값의 범위를 갖을때는 ==와 !=연산자로 내부의 값을 비교할수 있다.
그렇기 때문에 11라인은 범위에 들어가는 값 100이라 true가 출력되고
12라인은 범위 밖의 내부값을 가지기 때문에 내부비교가 불가능하고 참조를 비교하기 때문에 false를 출력한다.
왠만하면 내부값을 비교할때는 ==와 !=를 쓰기보다는 equals()메소드로 내부값을 비교하는 것이 좋다.
*/