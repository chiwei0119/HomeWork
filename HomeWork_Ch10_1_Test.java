package tw.larry.myproject.homeWork;

class Caaa {
	public int num1;
	public int num2;

	public Caaa() {
		num1 = 1;
		num2 = 1;
	}
	public Caaa(int a, int b) {
		num1 = a;
		num2 = b;
	}
	
	public void show() {
		System.out.println("Num1= " + num1);
		System.out.println("Num2= " + num2);
	}
}

class Cbbb extends Caaa {
	
	public Cbbb() {
		super();
	}
	
	public Cbbb(int a, int b) {
		super(a, b);
	}

	public void set_num(int num1, int num2) {

		this.num1 = num1;
		this.num2 = num2;
	}

	public void show() {
		System.out.println("Num1= " + num1);
		System.out.println("Num2= " + num2);
	}
}

public class HomeWork_Ch10_1_Test {

	public static void main(String[] args) {
		Cbbb a = new Cbbb();
		a.show();
		Caaa b = new Caaa(5,5);
		b.show();
		Cbbb c = new Cbbb(10, 10);
		c.show();
		
	}

}
