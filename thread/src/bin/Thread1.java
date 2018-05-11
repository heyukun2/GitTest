package bin;

public class Thread1 extends Thread {
	private String name;

	public Thread1(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("run " + name + "," + i);
			if (i >= 5) {
				this.yield();
			}
		}
	}
	public static void main(String[] args) {
		Thread1 test1 = new Thread1("张三");
		Thread1 test2 = new Thread1("李四");
		test1.start();
		test2.start();
		
	}
}
