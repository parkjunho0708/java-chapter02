package chapter02;

public class Customer {
	protected String name;
	private int age;
	
	// this는 객체 자신을 참조할 수 있는 키워드
	public String getName() {
		return name; //this.name 가능
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age; //this.age 가능
	}
	public void setAge(int age) {
		this.age = age;
	}
}
