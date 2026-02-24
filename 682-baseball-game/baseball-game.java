class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();

        for (String s : operations) {

            switch (s) {
                case "+" -> {
                    int a = stack.pop();
                    int b = stack.peek();

                    stack.push(a);
                    stack.push(a + b);
                }
                case "C" -> stack.pop();
                case "D" -> stack.push(stack.peek() * 2);
                default -> {
                    int num = Integer.parseInt(s);
                    stack.push(num);
                }
            }

            // System.out.println(stack);

        }

        int sum = 0;

        // System.out.println(stack);

        while (!stack.isEmpty()) {
            sum += stack.pop();
            //            System.out.print(stack.pop() + " ");
        }

        return sum ; 

    }
}