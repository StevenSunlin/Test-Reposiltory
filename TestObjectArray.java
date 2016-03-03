package Test1;

class Person4 {
	String name;
	int age;

	public Person4() {
	}

	public Person4(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String talk() {
		return "我是:" + this.name + ",今年:" + this.age + "岁";
	}
}

public class TestObjectArray {
	public static void main(String[] args) {
		Person4 p[] = { new Person4("张三", 25), new Person4("李四", 30),
				new Person4("王五", 35) };
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].talk());
		}
	}
}
