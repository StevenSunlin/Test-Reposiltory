package Test1;

class Person1 {
	String name;
	private static String city = "中国";
	int age;

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String talk() {
		return "This is " + name + ". His age is " + age + ". He is from "
				+ city;
	}

	public static void setCity(String c) {
		city = c;
	}
}

public class TestStaticDemo4 {
	public static void main(String[] args) {
		Person1 p1 = new Person1("张三", 25);
		Person1 p2 = new Person1("李四", 30);
		Person1 p3 = new Person1("王五", 35);
		System.out.println(p1.talk() + "\n" + p2.talk() + "\n" + p3.talk());
		Person1.setCity("美国");
		System.out.println("——修改之后的内容——");
		System.out.println(p1.talk() + "\n" + p2.talk() + "\n" + p3.talk());
	}
}
