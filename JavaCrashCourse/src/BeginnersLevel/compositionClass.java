package BeginnersLevel;

class Car {
	  
	  private int id;
	  private String model;
	  private String color;

	  public Car(int id, String model, String color){
	    this.id=id;
	    this.model=model;
	    this.color=color;
	  }

	  public void features(){
	    System.out.println(" car feature are : " + model + " "+ color + " "+id);
	  }

	  public void setModel(String model){
	    this.model=model;
	  }
	  public void setColor(String color){
	    this.color=color;
	  }
	  
	}

	class Toyota extends Car {
	   private ToyotaEngine eng;
	  public Toyota(int id, String model, String color,ToyotaEngine eng){
	    super(id, model, color);
	    this.eng=eng;
	  }

	 
	  public void setStart(){
	    eng.start();
	  }
	  
	}

	class ToyotaEngine {
	  
	  public void start(){
	    System.out.println("Engine has Started ");

	  }
	  public void Stop(){
	    System.out.println("Engine has Stopped");
	  }
	  
	}

	class compositionClass {

	  public static void main(String[] args) {
	    ToyotaEngine en= new ToyotaEngine();
	    Toyota nayicar= new Toyota(45," Corolla","Black",en);
	    nayicar.setStart();
	  }
	  
	}

