class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count=0;

        for(char current: s.toCharArray()){
            if(current=='('){
                stack.push(current);
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    count++;
                }
            }
        }
        return count+ stack.size();
        }
}