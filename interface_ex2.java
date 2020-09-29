abstract class Unit2 {
	int x,y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춤 ");}
	
}

interface Fightable {
	public abstract void move(int x, int y);
	public abstract void attack(Fightable f);
	
}

class Fighter extends Unit2 implements Fightable {
	//오버라이딩 규칙 : 조상(public)보다 접근제어자의 범위가 좁으면 안된다.
	public void move(int x, int y) {
		System.out.println("[" + x + "," + y + "]로 이동 ");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격 ");
	}
	
	//싸울 수 있는 상대를 불러온다.
	//반환타입이 인터페이스다 => 구현된 인터페이스 인스턴스 클래스를 반환한다.
	//여기서는 Fighter가 인터페이스 Fightable을 구현했기 때문에 Fighter를 반환해도 됨.
	//왜 인터페이스를 반환타입으로 쓰는가? 추상화! 
	//여기서는 Fighter지만 Fighter가 아니라도, 인터페이스 Fightable을 구현한 어떤 클래스라면 반환가능!(다형성, 추상화)
	Fightable getFightable() {
//		Fighter f = new Fighter();
//		return f;
		return new Fighter();//Fightable <= Fighter 일치(다형성)
		//return (Fightable)f;
		//Fightable f = new Fighter();
		//Fightable f = (Fightable) new Fighter();
		//조상이 자손을 가리킬 때는 생략이 가능하다.
		
	}
}
public class interface_ex2 { //FighterTest 

	public static void main(String[] args) {
		Fighter FFF = new Fighter();
		Fightable f2 = FFF.getFightable();//반환타입과 일치해야하기 때문에 Fightable타입에 넣어준다!		
		
		// TODO Auto-generated method stub
		System.out.println("Fighter");
		Fighter f = new Fighter();
		f.move(100,200);
		f.attack(new Fighter());
		
		System.out.println("Unit");
		Unit2 u = new Fighter(); //Unit2에 attack이 없어서 attack은 못쓴다.
		//u.attack(new Fighter());
		u.move(300, 400);
		u.stop();
		
		//Fightable 리모콘은 
		//move와 attack만 쓸 수 있다.
		System.out.println("Fightable");
		Fightable f4 = new Fighter();
		f4.move(400, 500);
		f4.attack(f4);
		//f4.stop();error
//		Fighter f2 = new Fighter();
//		f.attack(f2);
	}

}
