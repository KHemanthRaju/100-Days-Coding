class LRUCache {
    ArrayList<int[]> cache;
    int capacity;
    public LRUCache(int capacity) {
        this.cache = new ArrayList<>();
        this.capacity = capacity;
    }
    
    public int get(int key) {
        for(int i=0;i<cache.size();i++){
            if(cache.get(i)[0]==key){
                int[] temp = cache.remove(i);
                int ans = temp[1];
                cache.add(temp);
                return ans;
            }
        }
        return -1;
    }
    
    public void put(int key, int value) {
        for(int i=0;i<cache.size();i++){
            if(cache.get(i)[0]==key){
                int temp[] = cache.remove(i);
                temp[1] = value;
                cache.add(temp);
                return;
            }
        }
        if(cache.size()==capacity){
            cache.remove(0);
        }
        cache.add(new int[]{key,value});
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */