package task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class MultiMapValue<K, V> {
    private final HashMap<K, List<V>> hashMap = new HashMap<>();

    public void add(K key, V value) {
        hashMap.putIfAbsent(key, new ArrayList<>());
        hashMap.get(key).add(value);
    }

    public void addAll(K key, List<V> values) {
        for (V value: values) {
            this.add(key, value);
        }
    }

    public void addAll(MultiMapValue<K, V> map) {
        for (Map.Entry<K, List<V>> entry: map.hashMap.entrySet()) {
            this.addAll(entry.getKey(), entry.getValue());
        }
    }

    public V getFirst(K key) {
        if (!hashMap.containsKey(key)) {
            return null;
        }

        return hashMap.get(key).get(0);
    }

    public List<V> getValues(K key) {
        return hashMap.get(key);
    }

    public boolean containsKey(K key) {
        return hashMap.containsKey(key);
    }

    public boolean isEmpty() {
        return hashMap.isEmpty();
    }

    public List<V> remove(K key) {
        return hashMap.remove(key);
    }

    public int size() {
        return hashMap.size();
    }
}
