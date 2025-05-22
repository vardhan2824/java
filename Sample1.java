class Sample1 {

public static void main(String[] args){

Car car = new Car();
car.start();
car.stop();
}
}

class Car implements Vehicle{

public void start(){
 
System.out.println("This car start's");
}

public void stop(){

System.out.println("This car stop's");
}
}

