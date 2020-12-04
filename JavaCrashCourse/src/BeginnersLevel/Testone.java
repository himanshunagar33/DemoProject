package BeginnersLevel;
import BeginnersLevel.Simple;

class Testone {

public static void main(String[] args) throws ReflectiveOperationException {
	
	Class c= Class.forName("BeginnersLevel.Simple");
	System.out.println(c.getName());
}

}
