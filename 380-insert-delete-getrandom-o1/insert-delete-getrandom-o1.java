class RandomizedSet {

    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {

        if (map.containsKey(val)) {
            return false;
        }

        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val))
            return false;

        int idx = map.get(val);
        list.set(idx, list.getLast());

        map.put(list.get(idx), idx);

        list.removeLast();
        map.remove(val);

        return true;
    }

    public int getRandom() {
        int idx = (int) (Math.random() * list.size());
        return list.get(idx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */