package _07_generic;

public class Pair<K, V> {
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public static void main(String[] args) {
        Pair<String, Integer> one = new Pair<>();
        one.setKey("One");
        one.setValue(1);
        
        Pair<Integer, String> two = new Pair<>();
        two.setKey(2);
        two.setValue("Two");
        
        System.out.println("Key: " + one.getKey() + ", Value: " + one.getValue());
        System.out.println("Key: " + two.getKey() + ", Value: " + two.getValue());
	}

}
