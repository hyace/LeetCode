package leetcode.LRUCache;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 * Problem: LRU Cache
 * Description: Design and implement a data structure for Least Recently Used
 * (LRU) cache. It should support the following operations: get and set.
 * get(key) - Get the value (will always be positive) of the key if the key
 * exists in the cache, otherwise return -1.
 * set(key, value) - Set or insert the value if the key is not already present.
 * When the cache reached its capacity, it should invalidate the least recently
 * used item before inserting a new item.
 * Date: Aug 4 , 2014
 * 
 * @author Chyace
 * 
 */
public class LRUCache {
// 用来装item的LinkedHashMap子类对象
    CacheMap cache;

    public LRUCache(int capacity) {
        cache = new CacheMap(capacity);
    }
/**
 * 每次get容器中的值，都将相应元素删除重新插入，这时它就会位于最新的位置
 * @param key
 * @return
 */
    public int get(int key) {
        if (cache.containsKey(key)) {
            int value = cache.get(key);
            cache.remove(key);
            set(key, value);
            return value;
        }
        return -1;
    }

    public void set(int key, int value) {
        if (cache.containsKey(key)) cache.remove(key);
        cache.put(key, value);
    }

    public void show() {
        for (Entry<Integer, Integer> item : cache.entrySet()) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

/**
 * LinkedHashMap只能实现最旧移除而不会更新
 * 
 * @author Chyace
 * 
 */
class CacheMap extends LinkedHashMap<Integer, Integer> {

    private static final long serialVersionUID = 3240765461462956414L;

    private int MAX;

    CacheMap(int max) {
        this.MAX = max;
    }

    protected boolean removeEldestEntry(Entry<Integer, Integer> eldest) {
        return size() > MAX;
    }

}
