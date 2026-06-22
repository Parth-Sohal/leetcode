class Solution {
    public int maxNumberOfBalloons(String text) {

        HashMap<Character, Integer> mpp = new HashMap<>();

        mpp.put('b', 0);
        mpp.put('a', 0);
        mpp.put('l', 0);
        mpp.put('o', 0);
        mpp.put('n', 0);

        for (int i = 0; i < text.length(); i++) {

            char c = text.charAt(i);

            if (mpp.containsKey(c)) {
                mpp.put(c, mpp.get(c) + 1);
            }

        }

        mpp.put('l', mpp.get('l') / 2);
        mpp.put('o', mpp.get('o') / 2);

        int min = Integer.MAX_VALUE;

        for (Character c : mpp.keySet()) {
            if (c == 'b' || c == 'a' || c == 'n') {
                min = Math.min(min, mpp.get(c));
            }

        }

        int lVal = mpp.get('l');
        int oVal = mpp.get('o');

        min = Math.min(min, lVal);
        min = Math.min(min, oVal);

        return min;

    }
}