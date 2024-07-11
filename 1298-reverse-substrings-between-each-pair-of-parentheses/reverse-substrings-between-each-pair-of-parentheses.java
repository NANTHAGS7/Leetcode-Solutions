class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c == '('){
                st.push(c);
            }
            else if(c == ')'){
                String temp = "";
                while(st.peek() != '('){
                    temp += st.peek();
                    st.pop();
                }
                st.pop();
                for(char ch:temp.toCharArray()) st.push(ch);
            }
            else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.peek());
            st.pop();
        }
        return sb.reverse().toString();
    }
}