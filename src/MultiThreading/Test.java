package MultiThreading;

class MyThread extends Thread {
	
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("Call method");
		}
	}
}

public class Test{
	
	public static void main(String[] args) {
		MyThread t=new MyThread();
		
		MyRunnalbe r=new MyRunnalbe();
		Thread m=new Thread(r);	
		m.start();
		System.out.println("===========================");
		System.out.println("start() method call");
		t.start();// main method runs first and then call
		System.out.println("===========================");
		System.out.println("run() method call");
		t.run(); //call method runs first and then main
		for(int i=0;i<=5;i++){
			System.out.println("main method");
		}
	}
}

//RUNNABLE INTERFACE
class MyRunnalbe implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=10;i++){
			System.out.println("Runnable method");
		}
	}
}

/* yield(): method causes “to pause current executing Thread for giving the chance of
remaining waiting Threads of same priority”.*/

/*Join():If a Thread wants to wait until completing some other Thread then we should go for
join() method.*/

/*sleep() :If a Thread don’t want to perform any operation for a particular
amount of time.*/

/*Synchronized :If a method or block declared as the synchronized then at a time only one Thread is allow
to execute that method or block on the given object.*/

/*wait() :Once a Thread calls wait() method on the given object 1st it releases the lock of that
object immediately and entered into waiting state.*/

/*notify() and notifyAll() :Once a Thread calls notify() (or) notifyAll() methods it releases the lock of that object
but may not immediately.*/