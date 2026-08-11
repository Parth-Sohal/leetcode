/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {

        if (node == null) return node; 
    
        HashMap<Integer , Node> graphs = new HashMap<>() ;
        Queue<Node> q = new LinkedList<>() ;
        Node n1 = new Node(node.val) ;
        graphs.put(n1.val , n1) ;
        q.add(node) ;

        while(!q.isEmpty()){

            Node temp = q.poll() ;

            for(Node neighbours : temp.neighbors){

                Node n = neighbours ;

                if(!graphs.containsKey(n.val)){
                    graphs.put(n.val , new Node(n.val));
                    q.add(neighbours) ;
                }

                Node tempClone = graphs.get(temp.val);
                tempClone.neighbors.add(graphs.get(n.val)) ;


            }

        }    

        return n1 ; 



        
    }
}