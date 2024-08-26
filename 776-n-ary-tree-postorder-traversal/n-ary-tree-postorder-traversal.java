/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {

    public void order(Node root,List<Integer> l){
        if(root != null){
            for(var c:root.children){
                order(c,l);
            }
            l.add(root.val);
        }
    }

    public List<Integer> postorder(Node root) {
        List<Integer> l = new ArrayList<>();
        order(root,l);
        return l;
    }
}