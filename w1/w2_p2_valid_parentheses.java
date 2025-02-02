class Solution {
    public boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' ||c == '{' || c == '['){
                parentheses.push(c);
            } 
            else if (c == ')' || c == '}' || c == ']') {
                if(parentheses.isEmpty()){
                    return false;
                }
                char top = parentheses.pop();

                if( c == ')' && top != '(' ||
                    c == '}' && top != '{' ||
                    c == ']' && top != '[' ) {
                        return false;
                    }
            }

        }
        return parentheses.isEmpty();
    }
}