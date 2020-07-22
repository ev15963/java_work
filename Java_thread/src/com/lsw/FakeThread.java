package com.lsw;

public class FakeThread {

	private String name;

	
	
	public FakeThread() {
	}

	public FakeThread(String s) {
		this.name = s;
	}// »ı¼ºÀÚ end

	public void start() {
		this.run();
	}// start() End

	public void run() {
		int i = 0;
		while (i < 50) {
			System.out.println(this.getName());
			i++;
		}
	} // run END()

	public String getName() {
		return this.name;
	}

}
