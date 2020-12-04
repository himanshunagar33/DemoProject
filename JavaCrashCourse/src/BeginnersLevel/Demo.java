package BeginnersLevel;


class Base {
 
  public Base() {}
  public void print() { 
    System.out.println("Base");
  }
}
 
class Derived extends Base {
 
  public Derived() {}
 
}
 
class Demo {
  public static void main(String args[]) {
    Base obj = new Derived();
    obj.print();
  }
}