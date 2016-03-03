package Test1;

class Person3 {
	String name;
	private static final Person3 p = new Person3();

	private Person3() {
		name = "张三";
	}

	public static Person3 getP() {
		return p;
	}
}

public class TestSingleDemo2 {
	public static void main(String[] args) {
		Person3 p = null;
		p = Person3.getP();
		System.out.println(p.name);
	}
}
