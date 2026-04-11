class Solution {
    public String decodeString(String s) {
        int i = 0;

        Deque<String> deque = new LinkedList<>();

        while (i < s.length()) {

            char ch = s.charAt(i);

            if (ch == '[') {
                deque.addLast(ch + "");
                i++;
            } else if (ch >= '0' && ch <= '9') {

                int n = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    n = n * 10 + (s.charAt(i) - '0');
                    i++;
                }

                deque.addLast(n + "");

            } else if (ch >= 'a' && ch <= 'z') {
                StringBuilder sb = new StringBuilder();

                while (i < s.length() && Character.isLowerCase(s.charAt(i))) {
                    sb.append(s.charAt(i));
                    i++;
                }

                deque.addLast(sb.toString());
            } else {

                StringBuilder sb = new StringBuilder();

                while (!deque.isEmpty() && !deque.peekLast().equals("[")) {
                    sb.insert(0, deque.removeLast());
                }

                deque.pollLast();

                int n = 1; // default (safe fallback)

                if (!deque.isEmpty() && Character.isDigit(deque.peekLast().charAt(0))) {
                    n = Integer.parseInt(deque.removeLast());
                }

                StringBuilder rp = new StringBuilder();

                rp.append(String.valueOf(sb).repeat(Math.max(0, n)));

                deque.addLast(rp.toString());
                i++;

            }

            // System.out.println(deque);

        }

        StringBuilder sb = new StringBuilder();

        while (!deque.isEmpty()) {
            sb.append(deque.removeFirst());
        }

        return sb.toString();

    }
}