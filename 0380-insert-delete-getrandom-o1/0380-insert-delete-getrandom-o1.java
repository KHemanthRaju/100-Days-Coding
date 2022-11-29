class RandomizedSet {
    
    Map<Integer, Integer> map;
	// contains values
	List<Integer> allValues;
    
    public RandomizedSet() {
        map = new HashMap<>();
		allValues = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) return false;

		allValues.add(val);
		// keep track of index in array
		map.put(val, allValues.size() - 1);

		return true;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;

		// set the index of val with last element
		allValues.set(map.get(val), allValues.get(allValues.size() - 1));
		// update index in map
		map.put(allValues.get(allValues.size() - 1), map.get(val));

		map.remove(val);
		// O(1) remove
		allValues.remove(allValues.size() - 1);

		return true;
    }
    
    public int getRandom() {
        return allValues.get((int)(Math.random() * allValues.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */