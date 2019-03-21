package site.gaoyisheng.aimToOffer;

import java.util.Stack;

public class Q05_TwoStackReplaceQueue {

    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();
	  
    
	public static void main(String[] args) {

	    
	    for(int i = 0;i < 10; i++) {
	    	//0-10 入队
	    	push(i);
	    	
	    }
	    
	    //出队
	    for(int i = 10;i>0;i--) {
	    	System.out.println(pop());
	    }
		
	}


  
    public static void push(int node) {
		stack1.push(node);
    }
	    
    public static int pop() {
    	int result = 0;
    	//栈2 空，所有1进2,2再出
    	if(stack2.isEmpty()) {	
    		while(!stack1.isEmpty()) {
    			stack2.push(stack1.pop());
    		}
    		result = stack2.pop();
    	
    	//栈2 不空，2出
    	}else {					
    		result = stack2.pop();
    	}
    	return result;
    }

}

/**
 * 
 * Q:
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * 
 * 
 * A:<来源牛客网>
 * 
 *用两个栈实现一个队列的功能?要求给出算法和思路!
 *<分析>：
 *入队：将元素进栈A
 *出队：判断栈B是否为空，如果为空，则将栈A中所有元素pop，并push进栈B，栈B出栈；
 *	      如果不为空，栈B直接出栈。
 *=========================================================================================
 *用两个队列实现一个栈的功能?要求给出算法和思路!
 *<分析>：
 *入栈：将元素进队列A
 *出栈：判断队列A中元素的个数是否为1，
 *	如果等于1，则出队列，否则将队列A中的元素   以此出队列并放入队列B，直到队列A中的元素留下一个，
 *	然后队列A出队列，再把   队列B中的元素出队列以此放入队列A中。
 * 
 */
