class Outer22 {
	class InstanceInner {
		int iv = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 400;
		}
		
	}
}

class inner_class {
	public static void main(String[] args) {
		//내부클래스는 외부클래스의 일종의 멤버이기 때문
		//인스턴스 클래스의 인스턴스를 생성하려면 외부 클래스 인스턴스를 먼저 생성해야한다!
		
		Outer22 oc = new Outer22();
		Outer22.InstanceInner ii = oc.new InstanceInner();
		
		System.out.println("ii.iv" + ii.iv);
		//static 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다!
		System.out.println("Outer2.StaticInner.cv" + Outer22.StaticInner.cv);
	
		Outer22.StaticInner si = new Outer22.StaticInner();
		System.out.println("si.iv : " + si.iv);
		
		
	}
}