import java.util.*;

class stack_queue {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("조");
		st.push("흔");
		st.push("나");
		
		q.offer("사");
		q.offer("랑");
		q.offer("해");
		
		System.out.println("Stack = ");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		System.out.println("Queue = ");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}