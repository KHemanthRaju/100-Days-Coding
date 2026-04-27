class LRUCache {
    ArrayList<int[]> ans;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        ans = new ArrayList<>();
    }
    
    public int get(int key) {
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)[0] == key){
                int[] tmp = ans.remove(i);
                ans.add(tmp);
                return tmp[1];
            }
        }
        return -1;
    }
    
    public void put(int key, int value) {
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)[0]==key){
                int[] tmp = ans.remove(i);
                tmp[1] = value;
                ans.add(tmp);
                return;
            }
        }
        if(capacity == ans.size()){
            ans.remove(0);
        }
        ans.add(new int[]{key, value});
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */