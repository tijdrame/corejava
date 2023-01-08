package anonymousinner;

public class AnonymouseRunnable {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Anonymous Runnable Implementation");

			}

		});

		Runnable r = ()-> {
			System.out.println("Lambda ");
		};
		r.run();
		t.start();

	}

}
