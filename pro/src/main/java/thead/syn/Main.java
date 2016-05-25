package thead.syn;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventStorage storage = new EventStorage();
		Producer producer = new Producer(storage);
		Thread thread1 = new Thread(producer);
		
		Consumer consumer =  new Consumer(storage);
		Thread thread2 = new Thread(consumer);
		
		thread2.start();
		thread1.start();
	}

}
