import java.util.*;

public class QueueTest {

	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다. ");
		
		while(true) {
			System.out.print(">>");
			try {
				//get input line by line.
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);// exit
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말을 보여줍니다. ");
					System.out.println("q 또는 Q - 프로그램을 종료합니다. ");
					System.out.println("history - 최근에 입력한 명령어를. " + MAX_SIZE + "개 보여줍니다. ");
				} else if(input.equalsIgnoreCase("history")) {
					int j = 0;
					//save input
					save(input);
					
					//show LinkedList content 
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext())
						System.out.println(++j+"."+it.next());
				} else {
					save(input);
					System.out.println(input);
				} //if(input.equalsIgnoreCase("q")) {
			} catch(Exception e) {
				System.out.println("입력오류입니다. ");
			}
		}//while true
	}// main

	public static void save(String input) {
		//save in queue
		if(!"".contentEquals(input))
			q.offer(input);
		
		//if it oversize the size of queue, remove the first input.
		if(q.size() > MAX_SIZE)
			q.poll();//q.remove()
	}
}
