class equals {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);

		if (v1.equals(v2))
			System.out.println("v1과 v2는  같습니다 .");
		else
			System.out.println("v1과 v2는  다릅니다.");
	} // main
} 

class Value {
	int value;

	Value(int value) {
		this.value = value;
	}
	
	//Object의 equals()를 오버라이딩해서 주소가 아닌 value를 비교.
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Value)) {
			return false;
		}
		Value v = (Value)obj;
		
		return this.value==v.value;
	}
}