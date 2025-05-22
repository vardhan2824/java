class Main1{

public static void main(String... args){

Car car = new Car(4,1000000,"ferrari");
car.display();

}
}

class Vehicle{

int tyres;
double cost;
String model;

public Vehicle(int x ,float y,String s){

tyres = x;
cost =y;
model = s;
}
}

class Car extends Vehicle{

public Car(int x,float y,String s){
super(x,y,s);
}
public void display(){
System.out.println(tyres+" "+cost+" "+model);
}
}