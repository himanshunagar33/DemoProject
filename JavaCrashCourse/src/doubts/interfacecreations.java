package doubts;


interface sayable{
	public String say();
}
public class interfacecreations  {

	public static void main(String[] args) {
		sayable s = ()->{
			return " say nothing just work ";
		};
		System.out.println(s.say());
	}
	}

