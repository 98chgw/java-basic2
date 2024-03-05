package etc.generic.basic2;

public class Box<K, V> {
    public Box(K key, V value) {
        this.key = key;
        this.value = value;

    }


    public void put(K key, V value) {
        this.key = key;
        this.value = value;

    }


    public V get(K key) {

    }
