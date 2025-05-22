class Magic{

public static void main(String args[]){

Building b = new Building();
House h = new House();
h.walls();
b.walls();
h.bricks();
b.bricks();

}
}

class Building{

public void walls(){
System.out.println("This building has walls");
}

public void bricks(){
System.out.println("This building is constructed using bricks");
}

}

class House extends Building{

public void walls(){
System.out.println("This house has walls");
}

public void bricks(){
System.out.println("This house is made up of hallow bricks");
}
}
