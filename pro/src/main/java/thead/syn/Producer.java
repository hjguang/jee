package thead.syn;

public class Producer implements Runnable {
	private EventStorage storage;

	public Producer(EventStorage storage) {
		this.storage = storage;
	}
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			storage.set();
		}
	}

}
