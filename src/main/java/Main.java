public class Main
{
	public static void main(String[] args) 
	{
	    Stack<Integer> S1 = new Stack<>();
	    S1.push(5);
	    S1.push(4);
	    S1.push(91);
	    System.out.println(S1);
	    upsideDown(S1);
	    System.out.println(S1);
		
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
}
