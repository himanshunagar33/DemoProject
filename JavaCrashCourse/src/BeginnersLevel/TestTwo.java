package BeginnersLevel;

public class TestTwo {

	public void print(Object obj) {
		Class c= obj.getClass();
		System.out.println(c.getName());
	}
	
	public static void main(String[] args) {
		String s= new String();
		System.out.println(s.getClass());
		TestTwo t= new TestTwo();
		t.print(s);
	}
}
