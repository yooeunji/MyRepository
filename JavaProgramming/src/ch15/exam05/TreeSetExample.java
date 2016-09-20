package ch15.exam05;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> scores=new TreeSet<>();
		
		scores.add(87); //int가 Integer로 자동 박싱
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		int firstScore=scores.first();
		System.out.println(firstScore);
		System.out.println();
		
		int lastScore=scores.last();
		System.out.println(lastScore);
		System.out.println();
		
		int lowerScore=scores.lower(95); //95바로아래숫자
		System.out.println(lowerScore);
		System.out.println();
		
		int higherScore=scores.higher(95); //95바로 위의숫자
		System.out.println(higherScore);
		System.out.println();

		int floorScore=scores.floor(95);
		System.out.println(floorScore);
		System.out.println();
		
		int ceilingScore=scores.ceiling(85); //85있으면 85리턴, 없으면 바로위리턴
		System.out.println(ceilingScore);
		System.out.println();
		
		//정렬<-내림차순
		NavigableSet<Integer> descendingSet=scores.descendingSet();
		for(Integer score : descendingSet){
			System.out.println(score + ",");
		}
		System.out.println();
		
		//내림차순한것을 다시 내림차순하면 오름차순
		NavigableSet<Integer> ascendingSet=descendingSet.descendingSet();
		for(Integer score : ascendingSet){
			System.out.println(score + ",");
		}
		System.out.println();
		
		TreeSet<String> words=new TreeSet<>();
		words.add("apple");
		words.add("apply");
		words.add("forever");
		words.add("description");
		words.add("ever");
		words.add("zoo");
		words.add("base");
		words.add("guess");
		words.add("cherry");
		words.add("20"); //int가 아니라 word기 때무네 100보다 20이 더 크다. 앞자리
		words.add("100");
		
		NavigableSet<String> ns=words.descendingSet();
		for(String word : ns){
			System.out.println(word + ",");
		}
		System.out.println();
		
		NavigableSet<String> ns2=words.subSet("c", true, "f", true);
		for(String word : ns2){
			System.out.println(word + ",");
		}
		System.out.println();
	}

}
