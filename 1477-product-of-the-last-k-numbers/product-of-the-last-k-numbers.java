// brute force
class ProductOfNumbers {

    List<Integer> list2;
    int curr = 1;

    public ProductOfNumbers() {
        list2 = new ArrayList<>();
        list2.add(1);
    }

    public void add(int num) {

        if (num == 0) {
            curr = 1;
            list2.clear();
            list2.add(1);
        } else {
            curr *= num;
            list2.add(curr);
        }
    }

    public int getProduct(int k) {

        if (k >= list2.size()) {
            return 0;
        }

        int a = list2.get(list2.size() - 1);
        int b = list2.get(list2.size() - k - 1);

        return a / b;
    }
}