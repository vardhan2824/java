class A{
void show(){}
class B{
void hi(){}
void hello(){}
}
}
class C extends A{

public void show(){
System.out.println("showcasing");
}
public void hi(){
System.out.println("hi");
}
public void hello(){
System.out.println("hello");
}

public static void main(String args[]){
C c=new C();
c.show();
//c.hi();
//c.hello();
}
}