class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        HashMap<String,Integer> operants= new HashMap<>();

        operants.put("+",1);
        operants.put("-",2);
        operants.put("*",3);
        operants.put("/",2);

        for(String token: tokens){
            if(operants.containsKey(token)){
                int val2=stack.pop();
                int val1=stack.pop();
                stack.push(operate(token,val1,val2));
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
        
    }

    public int operate(String a, int v1, int v2){
        if(a.equals("+")){
            return v1+v2;
        }
        else if(a.equals("-")){
            return v1-v2;
        }
        else if(a.equals("*")){
            return v1*v2;
        }
        else if(a.equals("/")){
            return v1/v2;
        }
        else{
            return 0;
        }
    }
}
