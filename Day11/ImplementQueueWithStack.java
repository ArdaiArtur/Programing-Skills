package Day11;

import java.util.Stack;

public class ImplementQueueWithStack {
    Stack<Integer> s1 = new Stack<>(); 
    Stack<Integer> s2 = new Stack<>(); 

    public ImplementQueueWithStack() {
        
    }
    
    public void push(int x) {
        s1.push(x); 
    }
    
    public int pop() {
        while(!s1.isEmpty()){
            s2.push(s1.pop()); 
        }
        int ans = s2.pop(); 
        while(!s2.isEmpty()){
            s1.push(s2.pop()); 
        }
        return ans; 
    }
    
    public int peek() {
        while(!s1.isEmpty()){
            s2.push(s1.pop()); 
        }
        int ans = s2.peek(); 
        while(!s2.isEmpty()){
            s1.push(s2.pop()); 
        }
        return ans; 
    }
    
    public boolean empty() {
        if(s1.isEmpty()){
            return true;
        }else{
            return false; 
        }
    }
}
