package chapter02;

import chapter02.Customer;

public class CustomerApp {
	public static void main(String[] args) {
		Customer c = new Customer();
		
		// protected는 같은 패키지에서 접근 O
		// protected는 다른 패키지에서 접근이 안된다.
		//c.name = "둘리";
		c.setName("둘리");
		System.out.println(c.getName());
		
		// private은 외부에서 접근 X
		//c.age = 10;
		c.setAge(10);
		System.out.println(c.getAge());
		
	}
}

/*
 public
 protected (상속 + 같은 패키지)
 private
 */
