package BeginnersLevel;

import java.lang.reflect.Method;


public class AccessingPrivateDemo {

	public static void main(String[] args) throws Exception {
		Class c= Simple.class;
		Object o= c.newInstance();
		Method m= o.getClass().getDeclaredMethod("message", null);
		m.setAccessible(true);
		m.invoke(o, null);
	}
}
