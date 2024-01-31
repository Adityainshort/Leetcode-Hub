class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk  = new Stack<>();

        for(String s : tokens){
            if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*") ){
                int a =  stk.pop();
                int b =  stk.pop();
                int c = calc( a,b , s.charAt(0)) ;
                stk.push(c) ; 
            }else{
                stk.push(Integer.parseInt(s));
            }

        }
        return stk.pop() ;
    }
    public int calc (int a , int b , char c){
        
        switch(c){
            case '+' :
                return b+a ; 
            case '-' :
                return b-a ; 
            case '/' :
                return b/a ; 
            case '*' :
                return b*a ; 
        }
        return  0 ;
    }
}