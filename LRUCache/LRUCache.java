package leetcode.LRUCache;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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
    //
    // public LRUCache(int capacity) {
    //
    // }
    //
    // public int get(int key) {
    // return 0;
    // }
    //
    // public void set(int key, int value) {
    //
    // }
    HashMap<Integer, ListIterator<CacheNode>> cacheMap;
    LinkedList<Integer> cacheList;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cacheMap = new HashMap<Integer, ListIterator<CacheNode>>();
        cacheList = new LinkedList<Integer>();
    }

    public int get(int key) {
        return 0;
    }

    public void set(int key, int value) {
        if(cacheMap.containsKey(key)){
            Iterator it = cacheMap.get(key);
        }
        else{
            if(capacity==cacheList.size()){
                cacheMap.remove(cacheList.getLast());
                cacheList.removeLast();
            }
            cacheList.addFirst(value);
            cacheMap.put(key, cacheList.listIterator(cacheList.size()));
        }
    }
}

class CacheNode {
    int key;
    int value;

    CacheNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
