interface A{
void show();
class B{
void hi(){
System.out.println("hi");
}
void hello(){
System.out.println("hello");
}
}
}
class C  extends A.B implements A{

public void show(){
System.out.println("showcasing");
}
public static void main(String args[]){
C c=new C();
c.show();
c.hi();
c.hello();
}
}