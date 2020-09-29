class Outer {
	int value = 10;	// Outer3.this.value

	class Inner {
		int value = 20;   // this.value

		void method1() {
			int value = 30;
			System.out.println("            value :" + value);
			System.out.println("       this.value :" + this.value);
			System.out.println("Outer3.this.value :" + Outer.this.value);
		}
	} // Inner 클래스 끝
} // Outer 클래스 끝

class inner_outer_var {
	public static void main(String args[]) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method1();
	}
}