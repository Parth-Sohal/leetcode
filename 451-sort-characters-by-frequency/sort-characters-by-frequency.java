class Solution {

    static class Pair{
        Character ch ;
        int count ;

        Pair(Character ch,int count){
            this.ch=ch;
            this.count=count;
        }

    }

    public String frequencySort(String s) {

        HashMap<Character,Integer> map=new HashMap<>();

        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }


        PriorityQueue<Pair> pq = new  PriorityQueue<>(
                (a,b) -> b.count - a.count
        );

        for(Character ch : map.keySet()){
            pq.offer(new Pair(ch,map.get(ch)));
        }

        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty()){
            Pair p=pq.poll();

            sb.repeat(p.ch ,p.count);

        }

        return (sb.toString());


    }
}