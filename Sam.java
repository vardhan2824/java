import java.util.Scanner;
class Sam{
public static void main(String... ar){
//try{
Scanner sc = new Scanner(System.in);
try{
int a,b,c;
System.out.println("enter the value of a:");
a = sc.nextInt();
System.out.println("enter the value of b:");
b = sc.nextInt();
c = a/b;
System.out.println(c);
}
catch(ArithmeticException e){
System.out.println(e);
}
/*else{
System.out.println("The program is out of exceptions");
}*/
finally{
sc.close();
System.out.println("The scanner is closed");
}
}
}
