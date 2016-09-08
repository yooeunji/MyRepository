package ch13.exam06;

public class Util {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2){
		//이걸 쓸려면 K와 V가 결정되어야한다
	
		boolean keyCompare=p1.getKey().equals(p2.getKey());
		boolean valueCompare=p1.getValue().equals(p2.getValue());
		return keyCompare &&valueCompare;
	}
	
	public static <K, V> Pair<K, V> max(Pair<K, V> p3, Pair<K, V> p4){
			return p4;
	}
}
