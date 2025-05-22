public class Sample extends Thread{
public void timer() {
	for(int i = 10;i>=1;i--) {
	System.out.println(i);
	try {
	Thread.sleep(1000);
		}
	catch(InterruptedException e) {
		}
		}
	System.out.println("Work finished");
	}
public static void main(String[] a) {
	Sample s = new Sample();
	s.timer();
}
}