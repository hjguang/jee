package thead.syn;

public class Consumer implements Runnable {
	private EventStorage storage;

	public Consumer(EventStorage storage) {
		this.storage = storage;
	}

	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			storage.get();
		}
	}

}
