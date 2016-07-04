package thead.lock;

public class Job implements Runnable {
	private PrintQueue printQueue;

	public Job(PrintQueue printQueue) {
		this.printQueue = printQueue;
	}

	public void run() {
		System.out.printf("%s: Going to print a document\n", Thread
				.currentThread().getName());
		printQueue.printJob(new Object());
		System.out.printf("%s: The document has been printed\n", Thread
				.currentThread().getName());
	}

	public static void main(String[] args) {
		PrintQueue printQueue = new PrintQueue();
		Thread[] thread = new Thread[10];
		for (int i = 0; i < 10; i++) {
			thread[i] = new Thread(new Job(printQueue), "Thread " + i);
		}
		for (int i = 0; i < 10; i++) {
			thread[i].start();
		}
	}

}
