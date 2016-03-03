package Test1;

class Person {
	String name;
	int age;
	String city;

	public Person(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city= city;
	}

	public String talk() {
		return "This is " + name + ". His age is " + age + ". He is from "
				+ city;
	}
}
	public class TestStaticDemo1 {

		public static void main(String[] args) {
			Person p1 = new Person("Steven", 28,"Dalian");
			Person p2 = new Person("Wang", 24,"Dalian");
			Person p3 = new Person("Zhang", 15,"Dalian");
			System.out.println("×××××××××××修改之前的信息×××××××××××");
			System.out.println(p1.talk());
			System.out.println(p2.talk());
			System.out.println(p3.talk());
			System.out.println("----------------------修改之后的信息----------------------");
			p1.city="Beijing";
			p2.city="HongKong";
			p1.name="Zhao";
			System.out.println(p1.talk()+"\n"+p2.talk()+"\n"+p3.talk());
		}
	}

