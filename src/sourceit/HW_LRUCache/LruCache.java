package sourceit.HW_LRUCache;

public interface LruCache {
	
		int get(int key);

		void put(int key, int value);

		void setCapacity(int capacity);

}

