interface A {
public void hi();
static void hello(){
System.out.println("hello");
}
}
interface B{
public void show();
}
class M implements A,B{
public static void main(String[] args){
M a = new M();
a.hi();
A.hello();
a.show();
}

public void hi(){
System.out.println("hi");
}
public void show(){
System.out.println("show");
}
}