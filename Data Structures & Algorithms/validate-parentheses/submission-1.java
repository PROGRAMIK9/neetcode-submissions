class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='['||c=='{'||c=='('){
                stk.push(c);
            }else{
                if((c==']' || c=='}' || c==')') && stk.isEmpty()) return false;
                if(c==']' && stk.peek()!='[') return false;
                if(c=='}' && stk.peek()!='{') return false;
                if(c==')' && stk.peek()!='(') return false;
                stk.pop();
            }
        }
        if(stk.isEmpty())return true;
        else return false;
    }
}
