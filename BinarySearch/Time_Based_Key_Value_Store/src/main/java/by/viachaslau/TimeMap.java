package by.viachaslau;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//Space Complexity - O(n*m);
//Time Complexity - O(1) for set()  and O(logn) for get();
//Where n is the total number of values associated with a key and m is the total number of keys;
public class TimeMap {

    private Map<String, TreeMap<Integer, String>> m;

    public TimeMap() {
            m = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        m.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp,value);
    }

    public String get(String key, int timestamp) {
        if (!m.containsKey(key)) return "";
        TreeMap<Integer, String> timestamps = m.get(key);
        Map.Entry<Integer, String> entry = timestamps.floorEntry(timestamp);
        return entry == null ? "" : entry.getValue();
    }
}