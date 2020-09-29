//이렇게 인터페이스를 사용함으로써 코드를 변경할 때 변경을 최소화할 수 있다!
class A {
	public void method(I i) {
		i.method();
	}
}
//인터페이스를 사용하여 껍데기와 알맹이를 분리해보자!
//class B {
//	public void method() {
//		System.out.println("B클래스의 메서드");
//		
//	}
//	
//}
//class C {
//	public void method() {
//		System.out.println("C클래스의 메서드");
//		
//	}
//	
//}
//1. 메서드 선언(껍데기)
interface I {
	//메서드의 선언부만 들어가면된다! 
	public abstract void method();
}
//2. 메서드 구현(알맹이)
class B implements I {
	public void method() {
		System.out.println("B클래스의 메서드 in Interface I");
	}
	
}
//2. 메서드 구현(알맹이)
class C implements I {
	public void method() {
		System.out.println("C클래스의 메서드 in Interface I");
	}
	
}
public class interface_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		//a.method(new B());//A가 B에 의존한다(사용한다) 
		a.method(new B());
//		a.method(new C());
		C c = new C();
        a.method(c);
	}

}
