import java.util.Objects;

class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	
	// Rule : equals를 오버라이딩하면 hashCode()도 오버라이딩해야한다. 
	//Objects클래스는 객체와 관련된 유용한 메서드를 제공하는 유틸 클래스.
	//int hash(Object...values) {...}
	//매개변수가 가변인자(Object...)라서 호출 시 지정하는 값의 개수가 정해져있지 않다.
	public int hashCode() {
		return Objects.hash(kind,number);
	}
	//equals도 오버라이딩. 오버라이딩할 땐 선언부가 일치해야함!
	public boolean equals(Object obj) {
		if(!(obj instanceof Card))
			return false;
		
		Card c = (Card)obj;
		//return this.kind == c.kind && this.number == c.number;
		//kind가 String이기 때문에 
		return this.kind.equals(c.kind) && this.number == c.number;
	}
	
	//Object 클래스의 toString()을 오버라이딩 
	public String toString() {
		return "kind:"+kind + ", number:" + number;
	}
}

class hashCode_toString {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();

		System.out.println(c1.equals(c2));
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
}