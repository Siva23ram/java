package day13;
class worker extends Thread{
	public void run() {
		Thread.currentThread().setName("run_method");
		System.out.println("Worker Thread is running");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(currentThread().getName()+ " run method ia alive check:"+currentThread().isAlive());
		System.out.println("worker thread is done");
}
}
public class Thread_cylce extends Thread{

	public static void main(String[] args) {
		worker obj=new worker();
		obj.start();
		try {
			obj.join();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main Thread ia alive check:"+currentThread().isAlive());
		System.out.println("main thread is done");
		System.out.println(obj.getName()+ " run method ia alive check:"+obj.isAlive());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//currentThread().stop();
		System.out.println("main Thread ia alive check:"+currentThread().isAlive());

	}

	}

