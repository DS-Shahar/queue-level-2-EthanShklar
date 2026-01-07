public class Main
{
	public static void main(String[] args) 
	{
	    Stack<Integer> S1 = new Stack<>();
	    Queue<Integer> Q1 = new Queue<>();
	    S1.push(5);
	    S1.push(4);
	    S1.push(91);
	    Q1.insert(7);
	    Q1.insert(6);
	    Q1.insert(30);
	    System.out.println(S1);
	    upsideDown(S1);
	    System.out.println(S1);
	    System.out.println(Q1);
	    upsideDownQueue(Q1);
	    System.out.println(Q1);
		
	}
	
	public static void upsideDown(Stack<Integer> stack)
	{
	    Queue<Integer> q = new Queue<>();
	    while (!stack.isEmpty())
	    {
	        q.insert(stack.pop());
	    }
	    while(!q.isEmpty())
	    {
	        stack.push(q.remove());
	    }
	}
	
	public static void upsideDownQueue(Queue<Integer> q)
	{
	    Stack<Integer> stack = new Stack<>();
	    while(!q.isEmpty())
	    {
	        stack.push(q.remove());
	    }
	    while(!stack.isEmpty())
	    {
	        q.insert(stack.pop());
	    }
	}
}
